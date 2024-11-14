import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.littlelemon.R
import com.example.littlelemon.Routes


@Composable
fun LoginScreen(navcontroller: NavController){
    Column(

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        modifier = Modifier.fillMaxSize()



    ){
        Image(
            painter = painterResource(
                id = R.drawable.logo),
            contentDescription = "Logo Image"
        )
        TextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Username") },
        )
        TextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Password") }
        )
        Button(
            onClick = {
                navcontroller.navigate(Routes.HomeScreen)
            },
            colors = ButtonDefaults.buttonColors(Color(0xFF495E57))
        ){
            Text(
                text = "Login",
                color = Color(0XFFEDEFEE)
            )
        }
    }
}

/*
@Preview
@Composable
fun LoginScreenPreview(){
    LoginScreen()
}

*/