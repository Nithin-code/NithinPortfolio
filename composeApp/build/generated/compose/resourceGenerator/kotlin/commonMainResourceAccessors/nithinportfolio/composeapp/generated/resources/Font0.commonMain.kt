@file:OptIn(InternalResourceApi::class)

package nithinportfolio.composeapp.generated.resources

import kotlin.OptIn
import kotlin.String
import kotlin.collections.MutableMap
import org.jetbrains.compose.resources.FontResource
import org.jetbrains.compose.resources.InternalResourceApi
import org.jetbrains.compose.resources.ResourceItem

private const val MD: String = "composeResources/nithinportfolio.composeapp.generated.resources/"

internal val Res.font.ubuntu_medium: FontResource by lazy {
      FontResource("font:ubuntu_medium", setOf(
        ResourceItem(setOf(), "${MD}font/ubuntu_medium.ttf", -1, -1),
      ))
    }

internal val Res.font.ubuntu_regular: FontResource by lazy {
      FontResource("font:ubuntu_regular", setOf(
        ResourceItem(setOf(), "${MD}font/ubuntu_regular.ttf", -1, -1),
      ))
    }

@InternalResourceApi
internal fun _collectCommonMainFont0Resources(map: MutableMap<String, FontResource>) {
  map.put("ubuntu_medium", Res.font.ubuntu_medium)
  map.put("ubuntu_regular", Res.font.ubuntu_regular)
}
