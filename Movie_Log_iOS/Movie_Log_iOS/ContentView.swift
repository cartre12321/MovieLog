import SwiftUI
import Shared

struct ContentView: View {
	let movieDataFetcher = MovieDataFetcher()
    @State var displayedText = "Loading..."
    
    func load() {
        movieDataFetcher.getFact { result, error in
            if let result = result {
                displayedText = result
            } else {
                displayedText = "Oh No!"
            }
        }
    }
    
    var body: some View {
        Text(displayedText).onAppear() {
            load()
        }
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
