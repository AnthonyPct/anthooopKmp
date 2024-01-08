import SwiftUI
import composeApp

@main
struct iOSApp: App {
        // KMM - Koin Call
    init() {
        KoinHelperKt.doInitKoin()
    }
	var body: some Scene {
		WindowGroup {
			ContentView()
		}
	}
}