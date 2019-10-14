# Jetpack Demo

This repo is a quick demo of the new Jetpack Compose library, with the binaries being fetched from the newly discovered Maven links.

I wrote about this [here](https://adambennett.dev/2019/10/jetpack-compose-now-on-maven/) if you want to know more about how to get this setup yourself, or feel free to clone/fork this repo. 

## Example

```kotlin
@Composable
fun mainLayout() {
    val (text, setText) = +state { "Hello, World!" }
    MaterialTheme {
        Column(
            modifier = padding(8.dp),
            mainAxisAlignment = MainAxisAlignment.Center,
            crossAxisAlignment = CrossAxisAlignment.Center
        ) {
            Text(text = text, modifier = absolutePadding(bottom = 8.dp))
            Button(text = "Click me", onClick = { setText("Button Clicked!") })
        }
    }
}
```
