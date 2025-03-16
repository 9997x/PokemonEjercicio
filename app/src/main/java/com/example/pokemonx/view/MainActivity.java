package com.example.pokemonx.view;

import android.os.Bundle;

import com.example.pokemonx.R;
import com.example.pokemonx.model.Bulbasaur;
import com.example.pokemonx.model.Charmander;
import com.example.pokemonx.model.Pikachu;
import com.example.pokemonx.model.Squirtle;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;



import com.example.pokemonx.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Pikachu pikachu = new Pikachu();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Squirtle squirtle = new Squirtle();
        pikachu.nombre = "Nombre: Pikachu";
        pikachu.peso = 2.5;
        pikachu.sexo = "Macho";
        pikachu.numPokedex = 25;
        pikachu.temporadaAparicion = 1;
        System.out.println(pikachu.nombre);
        System.out.print("Peso ");
        System.out.println(pikachu.peso);
        System.out.println(pikachu.sexo);
        System.out.print("Numero de pokedex ");
        System.out.println(pikachu.numPokedex);
        System.out.print("Temporada de aparicion ");
        System.out.println(pikachu.temporadaAparicion);
        pikachu.atacarImpactrueno();
        pikachu.atacarPunioTrueno();
        pikachu.atacarRayo();
        pikachu.atacarRayoCarga();


        charmander.nombre = "Charmander";
        charmander.peso = 5.5;
        charmander.sexo = "Macho";
        charmander.numPokedex = 15;
        charmander.temporadaAparicion = 1;
        System.out.println(charmander.nombre);
        System.out.print("Peso ");
        System.out.println(charmander.peso);
        System.out.println(charmander.sexo);
        System.out.print("Numero de pokedex ");
        System.out.println(charmander.numPokedex);
        System.out.print("Temporada de aparicion ");
        System.out.println(charmander.temporadaAparicion);
        charmander.atacarPlacaje();
        charmander.atacarAscuas();
        charmander.atacarLanzallamas();
        charmander.atacarPunioFuego();
        charmander.atacarMordisco();
        charmander.atacarAraniazo();


        bulbasaur.nombre = "Bulbasaur";
        bulbasaur.peso = 9.5;
        bulbasaur.sexo = "Macho";
        bulbasaur.numPokedex = 35;
        bulbasaur.temporadaAparicion = 1;
        System.out.println(bulbasaur.nombre);
        System.out.print("Peso ");
        System.out.println(bulbasaur.peso);
        System.out.println(bulbasaur.sexo);
        System.out.print("Numero de pokedex ");
        System.out.println(bulbasaur.numPokedex);
        System.out.print("Temporada de aparicion ");
        System.out.println(bulbasaur.temporadaAparicion);
        bulbasaur.atacarAraniazo();
        bulbasaur.atacarDrenaje();
        bulbasaur.atacarHojaAfilada();
        bulbasaur.atacarParalizar();
        bulbasaur.atacarPlacaje();
        bulbasaur.atacarLatigoCepa();
        bulbasaur.atacarMordisco();

        squirtle.nombre = "Squirtle";
        squirtle.peso = 12.5;
        squirtle.sexo = "Macho";
        squirtle.numPokedex = 20;
        squirtle.temporadaAparicion = 1;
        System.out.println(squirtle.nombre);
        System.out.print("Peso ");
        System.out.println(squirtle.peso);
        System.out.println(squirtle.sexo);
        System.out.print("Numero de pokedex ");
        System.out.println(squirtle.numPokedex);
        System.out.print("Temporada de aparicion ");
        System.out.println(squirtle.temporadaAparicion);
        squirtle.atacarAraniazo();
        squirtle.atacarPlacaje();
        squirtle.atacarMordisco();
        squirtle.atacarHidrobomba();
        squirtle.atacarBurbuja();
        squirtle.atacarHidropulso();
        squirtle.atacarPistolaAgua();














        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }

}