    package com.example.materialdesignref;

    import androidx.appcompat.app.AppCompatActivity;
    import androidx.navigation.NavController;
    import androidx.navigation.Navigation;
    import androidx.navigation.ui.AppBarConfiguration;
    import androidx.navigation.ui.NavigationUI;

    import android.os.Bundle;

    public class MainActivity extends AppCompatActivity {
        NavController navController;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
//            navController=Navigation.findNavController(this,R.id.fragmentContainerView);
//            NavigationUI.setupActionBarWithNavController(this,navController);


        }

        @Override
        protected void onStart() {
            super.onStart();
            navController=Navigation.findNavController(this,R.id.fragmentContainerView);
            NavigationUI.setupActionBarWithNavController(this,navController);
        }

        @Override
        public boolean onSupportNavigateUp() {
            return super.onSupportNavigateUp() || Navigation.findNavController(this,R.id.fragmentContainerView).navigateUp();
        }
    }