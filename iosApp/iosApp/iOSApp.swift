import SwiftUI
import shared

@main
struct iOSApp: App {
    let sdk = ZooSDK()
        var body: some Scene {
            WindowGroup {
                ContentView(viewModel: .init(sdk: sdk))
            }
        }
}
