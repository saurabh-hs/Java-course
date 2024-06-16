package com.app;

//Implementation of the Playable interface in the Game class
class Game implements Playable {
	//Field of Game class
	private String title;
	
	//Constructor to initialize the title of the game
	public Game(String title) {
		this.title = title;
	}

	//Implementation of the play method
	@Override
	public void play() {
		System.out.println("Playing the game: "+title);
	}
	
	//Getter for title
	public String getTitle() {
		return title;
	}
}

//Implementation of the Playable interface in the Movie class
class Movie implements Playable {
	//Field of Movie class
	private String title;
	
	//Constructor to initialize the title of Movie class
	public Movie(String title) {
		this.title = title;
	}
	
	//Implementation of the play method
	@Override
	public void play() {
		System.out.println("Playing the movie: "+title);
	}
	
	//Getter for title
	public String getTitle() {
		return title;
	}
}

public class Main {

	public static void main(String[] args) {
		//Create object of Game class
		Game game = new Game("The Legend of Zelda");
		Movie movie = new Movie("Inception");
		
		//Play the game and the movie
		playMedia(game);
		playMedia(movie);
	}
	
	//Method to play any Playable media
	public static void playMedia(Playable playable) {
		playable.play();
	}

}
