import Foundation
import composeApp

class DiModule {
    static var koin = {
        KoinInit().doInit(
                appDeclaration: { _ in
                    // Do nothing
                }
        )
    }()
}
