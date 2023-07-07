import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.MailOutline
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Posting() {
    Box(modifier = Modifier.fillMaxSize()) {
        Icon(imageVector = Icons.Rounded.MailOutline,
            contentDescription = "home",
            tint = Color.Blue,
            modifier = Modifier.size(150.dp)
                .align(Alignment.Center)
        )
    }
}