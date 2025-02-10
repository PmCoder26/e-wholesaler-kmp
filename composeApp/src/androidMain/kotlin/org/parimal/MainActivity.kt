package org.parimal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import io.ktor.client.engine.okhttp.OkHttp
import org.example.project.ktor_client.createHttpClient

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val datastore = remember {
                createDataStore(this@MainActivity)
            }
            val httpclient = remember {
                createHttpClient(OkHttp.create(), datastore)
            }
            App()
        }
    }

}

@Preview(showBackground = true)
@Composable
fun AppAndroidPreview() {
    App()
}
