//
//  RocketLaunchRow.swift
//  iosApp
//
//  Created by jiskelo on 24.02.2023.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI
import shared

struct ProductRow: View {
    var product: Product

        var body: some View {
            HStack {
                VStack(alignment: .leading, spacing: 10.0) {
                    let imageUrl = URL(string: "https://zoo-zoo-zoo.com.ua/" + product.smallImageUri)
                    if #available(iOS 15.0, *) {
                        AsyncImage(url: imageUrl, content: { image in
                            image.resizable()
                                .aspectRatio(contentMode: .fit)
                                .frame(maxWidth: 300, maxHeight: 100)
                           }, placeholder: {
                               ProgressView()
                           })
                    } else {
                        CustomImageView(url: imageUrl!)
                    }
                    Text(product.title)
                        .font(.system(size: 15))
                        .lineLimit(2)
                        .multilineTextAlignment(.center)
                        .padding(10)
                    HStack(alignment: .center, spacing: 100.0){
                        Text("\(Int(product.price)) ₴")
                            .font(.system(size: 14))
                            .foregroundColor(.red)
                        Image(systemName: "cart.badge.plus")
                    }
                    .padding(10)
                }
            }
            .background(Color.white)
            .cornerRadius(12.0)
            .shadow(color: Color.gray, radius: 3, x: 0, y: 0)
        }
}

