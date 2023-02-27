//
//  ImageLoader.swift
//  iosApp
//
//  Created by jiskelo on 26.02.2023.
//  Copyright © 2023 orgName. All rights reserved.
//

import Foundation
import UIKit

class ImageLoaderService: ObservableObject {
    @Published var image: UIImage = UIImage()
    
    func loadImage(for url: URL) {
        let task = URLSession.shared.dataTask(with: url) { data, response, error in
            guard let data = data else { return }
            DispatchQueue.main.async {
                self.image = UIImage(data: data) ?? UIImage()
            }
        }
        task.resume()
    }
    
}
