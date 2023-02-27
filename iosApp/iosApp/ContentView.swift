//
//  ContentView.swift
//  iosApp
//
//  Created by jiskelo on 24.02.2023.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI
import shared

struct ContentView: View {
    @ObservedObject private(set) var viewModel: ViewModel
    
    let columns = [
            GridItem(.flexible()),
            GridItem(.flexible()),
        ]

       var body: some View {
           NavigationView {
               listView()
               .navigationBarTitle("Recommended")
               .navigationBarItems(trailing:
                   Button("Reload") {
                       self.viewModel.loadRecommended(forceReload: true)
               })
           }
       }

       private func listView() -> AnyView {
           switch viewModel.recommended {
           case .loading:
               return AnyView(Text("Loading...").multilineTextAlignment(.center))
           case .result(let recommended):
               return AnyView(
                ScrollView {
                    LazyVGrid(columns: columns, spacing: 15) {
                        ForEach(recommended.data.products, id: \.id){ product in
                            ProductRow(product: product)
                        }
                    }
                    .padding(10)
                }
               )
           case .error(let description):
               return AnyView(Text(description).multilineTextAlignment(.center))
           }
       }
}

extension ContentView {

    enum LoadableLaunches {
        case loading
        case result(Response)
        case error(String)
    }

    class ViewModel: ObservableObject {
        let sdk: ZooSDK
        @Published var recommended = LoadableLaunches.loading

        init(sdk: ZooSDK) {
            self.sdk = sdk
            self.loadRecommended(forceReload: false)
        }

        func loadRecommended(forceReload: Bool) {
            self.recommended = .loading
            sdk.getRecommended(forceReload: forceReload, completionHandler: { recommended, error in
                if let recommended = recommended {
                    self.recommended = .result(recommended)
                } else {
                    self.recommended = .error(error?.localizedDescription ?? "error")
                }
            })
        }
    }
}

extension RocketLaunch: Identifiable { }
