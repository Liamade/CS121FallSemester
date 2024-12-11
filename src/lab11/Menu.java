package lab11;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    //Scanner instance
    Scanner scnr = new Scanner(System.in);
    //Pokedex instance
    Pokedex pokedex = new Pokedex();


    //METHODS
        //display menu method
    public void displayMenu(){
        while(true){
            String selection;
            System.out.printf("\n%s MENU %s\n","*".repeat(9),"*".repeat(9));
            String menuHeader = String.format("1) %s\n2) %s\n3) %s\n4) %s\n5) %s\n%s","Add a Pokemon","Remove a Pokemon","Display Pokemon Information","Display All Pokemon Information","Exit",">>");
            System.out.print(menuHeader);
            //user selection
            selection = scnr.nextLine();
            if(selection.equals("1")){
                createPokemon();

            } else if (selection.equals("2")) {
                deletePokemon();

            } else if (selection.equals("3")) {
                displayPokemon();

            } else if (selection.equals("4")) {
                displayAllPokemon();

            } else if (selection.equals("5")) {
                System.out.println("Exiting.........");
                break;
            }
            else{
                System.out.println("Invalid Selection");
            }


        }

    }

        //create pokemon method
    private void createPokemon(){
        //declare variables
        String name, moveName;
        int hp, movePower, moveSpeed, userChoice;
        Pokemon pokemon;
        Move move;
        System.out.println("Would you like to (1) enter Pokemon details manually or " +
                "(2) Select from file?");
        userChoice = Integer.parseInt(scnr.nextLine());
        if(userChoice == 1){
            System.out.printf("Enter Pokemon Name: ");
            name = scnr.nextLine();
            System.out.printf("Enter Pokemon HP: ");
            hp = Integer.parseInt(scnr.nextLine());
            pokemon = new Pokemon(name, hp);
            pokedex.addPokemon(pokemon);
            System.out.printf("%s added to Pokedex\n\n",name);
            //call to addMoves to Pokemon method
            addMovestoPokemon(pokemon);

        }
        else if (userChoice == 2) {
            //create instance of file read class
            FileRead fileReader = new FileRead();
            //create array list of PokemonData
            //try catch statement
            ArrayList<String[]> pokemonData;
            try{
                pokemonData = fileReader.readPokemonData("CharacterStatsFile.txt");

                if(pokemonData.isEmpty()){
                    System.out.println("No Pokemon Data available");
                    return;
                }
                //Display options from file
                for(int x = 0 ; x < pokemonData.size() ; x++){
                    System.out.printf("%d : %s",(x+1),pokemonData.get(x)[0]);
                }
                //declare variables to hold the index item
                int selectedIndex = Integer.parseInt(scnr.nextLine())-1;
                if(selectedIndex >= 0 && selectedIndex < pokemonData.size()){
                    String[] selectedPokemonData = pokemonData.get(selectedIndex);

                    name = selectedPokemonData[0];
                    hp = Integer.parseInt(selectedPokemonData[1]);
                    moveName = selectedPokemonData[2];
                    movePower = Integer.parseInt(selectedPokemonData[3]);
                    moveSpeed = Integer.parseInt(selectedPokemonData[4]);

                    pokemon = new Pokemon(name,hp);
                    move = new Move(moveName,movePower,moveSpeed);

                    pokemon.addMove(move);
                    pokedex.addPokemon(pokemon);
                    System.out.println("The Pokmeon has been added from the file data");
                }
                else{
                    System.err.println("INVALID SELECTION");
                }
                //block of code

            }catch(FileNotFoundException e){
                System.err.println("ERROR: POKEMON DATA NOT FOUND");

            }

        }
        else {
            //the err displays the message in red
            System.err.println("Invalid Entry");
        }
    }
    private void addMovestoPokemon(Pokemon pokemon){
        //add code

        while(true){
            System.out.println("Enter Move name or 'q' to quit");
            System.out.printf(">>");
            String moveName = scnr.nextLine();
            if(moveName.equalsIgnoreCase("q")){
                break;
            }
            System.out.print("\tEnter Move's Power:");
            int movePower = Integer.parseInt(scnr.nextLine());
            System.out.printf("\tEnter Move's Speed:");
            int moveSpeed = Integer.parseInt(scnr.nextLine());

            Move move = new Move(moveName,movePower,moveSpeed);
            pokemon.addMove(move);
        }
    }

        //delete pokemon method
    private void deletePokemon(){
        String name;
        Pokemon pokemon;
        System.out.println("Enter in pokemon you want to delete");
        name = scnr.nextLine();
        pokemon = pokedex.getPokemon(name);
        if(pokemon == null){
        }else {
            pokedex.removePokemon(pokemon);
        }
    }

        //display pokemon method
    private void displayPokemon(){
        String name;
        Pokemon pokemon;
        System.out.println("Enter name of Pokemon to see Info: ");
        name = scnr.nextLine();
        pokemon = pokedex.getPokemon(name);
        if(pokemon == null){
            System.out.println("Pokemon not found");
        }else{
            System.out.println(pokemon);
        }
    }

        //display all pokemon method
    private void displayAllPokemon(){
        //pokedex instance to get all pokemon in array list
        ArrayList<Pokemon> pokemonArrayList = pokedex.getAllPokemon();
        //if statement
        if(pokemonArrayList.isEmpty()){
            System.out.println("No Pokemon in the Pokedex");
            return;
        }
        //Enhanced for loop
        System.out.println("All Pokemon in Pokedex");
        for(Pokemon pokemon : pokemonArrayList){
            System.out.printf("Name: %s",pokemon.getName());
            System.out.printf("Name: %s",pokemon.getHp());

            ArrayList<Move> movesArrayList = pokemon.getMoveArrayList();
            if(movesArrayList.isEmpty()){
                System.out.println("<<No Moves Available>>");

            }else{
                System.out.println("Moves:");
                //enhanced for loop
                for(Move move : movesArrayList){
                    System.out.printf("\t\tMove Names: %s\n",move.getMoveName());
                    System.out.printf("\t\tMove Power: %d\n",move.getMovePower());
                    System.out.printf("\t\tMove Speed: %d\n",move.getMoveSpeed());
                }
            }
            System.out.println();
        }

    }



}
