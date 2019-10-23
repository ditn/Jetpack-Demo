# Jetpack Demo (Deprecated)

This repo was a quick demo of the Jetpack Compose library, with the binaries being fetched from the then-newly discovered Maven links. Whilst it compiles and renders the Views, it's broken in subtle ways (such as observing `@Models`, which is half the point of Compose).

Since then, Google have updated their binaries and released full-featured IDE support, as well as in depth tutorials which can be found [here](https://developer.android.com/jetpack/compose/tutorial). Please don't use this: I'm just keeping it up as a link from my blog.

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
