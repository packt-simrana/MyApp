/* While this template provides a good starting point for using Wear Compose, you can always
 * take a look at https://github.com/android/wear-os-samples/tree/main/ComposeStarter and
 * https://github.com/android/wear-os-samples/tree/main/ComposeAdvanced to find the most up to date
 * changes to the libraries and their usages.
 */

package com.example.wearosexample.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.*
import com.example.wearosexample.presentation.theme.WearOSExampleTheme
import com.madonasyombua.wearosexample.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WearApp()
        }
    }
}

@Composable
fun WearApp() {
    WearOSExampleTheme {
        /* If you have enough items in your list, use [ScalingLazyColumn] which is an optimized
         * version of LazyColumn for wear devices with some added features. For more information,
         * see d.android.com/wear/compose.
         */
        val itemList = listOf(
            "Item 1",
            "Item 2",
            "Item 3",
            "Item 4",
            "Item 5",
        )
        val contentModifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp)
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.background),
            verticalArrangement = Arrangement.Center
        ) {
             WearOSList(itemList = itemList, Modifier = contentModifier)
        }
    }
}

//@Composable
//fun SampleButton() {
//    Button(
//        onClick = { /* Handle button click */ },
//        modifier = Modifier.fillMaxWidth()
//    ) {
//        Text("Click me")
//    }
//}

//@Composable
//fun SampleButton2() {
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(bottom = 10.dp),
//        horizontalArrangement = Arrangement.Center
//    ) {
//
//        Button(
//            modifier = Modifier.size(ButtonDefaults.LargeButtonSize),
//            onClick = { /* Handle button click */ },
//        ) {
//            Icon(
//                imageVector = Icons.Rounded.AccountBox,
//                contentDescription = stringResource(id = R.string.account_box_icon),
//                modifier = Modifier
//                    .size(24.dp)
//                    .wrapContentSize(align = Alignment.Center)
//            )
//        }
//    }
//}

@Composable
fun  WearOSList(itemList: List<String>, Modifier: Modifier) {
    ScalingLazyColumn() {
        // TODO: Add items to the list here
    }
}

@Composable
fun WearOSListItem(item: String) {
    Text(text = item)
}


@Preview(device = Devices.WEAR_OS_SMALL_ROUND, showSystemUi = true)
@Composable
fun DefaultPreview() {
    WearApp()
}