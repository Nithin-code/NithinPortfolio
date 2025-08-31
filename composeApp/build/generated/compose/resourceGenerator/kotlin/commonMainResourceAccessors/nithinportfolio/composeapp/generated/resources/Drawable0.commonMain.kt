@file:OptIn(InternalResourceApi::class)

package nithinportfolio.composeapp.generated.resources

import kotlin.OptIn
import kotlin.String
import kotlin.collections.MutableMap
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.InternalResourceApi
import org.jetbrains.compose.resources.ResourceItem

private const val MD: String = "composeResources/nithinportfolio.composeapp.generated.resources/"

internal val Res.drawable.Kotlin: DrawableResource by lazy {
      DrawableResource("drawable:Kotlin", setOf(
        ResourceItem(setOf(), "${MD}drawable/Kotlin.png", -1, -1),
      ))
    }

internal val Res.drawable.compose_multiplatform: DrawableResource by lazy {
      DrawableResource("drawable:compose_multiplatform", setOf(
        ResourceItem(setOf(), "${MD}drawable/compose-multiplatform.xml", -1, -1),
      ))
    }

internal val Res.drawable.down: DrawableResource by lazy {
      DrawableResource("drawable:down", setOf(
        ResourceItem(setOf(), "${MD}drawable/down.png", -1, -1),
      ))
    }

internal val Res.drawable.java: DrawableResource by lazy {
      DrawableResource("drawable:java", setOf(
        ResourceItem(setOf(), "${MD}drawable/java.png", -1, -1),
      ))
    }

internal val Res.drawable.save_money: DrawableResource by lazy {
      DrawableResource("drawable:save_money", setOf(
        ResourceItem(setOf(), "${MD}drawable/save_money.png", -1, -1),
      ))
    }

@InternalResourceApi
internal fun _collectCommonMainDrawable0Resources(map: MutableMap<String, DrawableResource>) {
  map.put("Kotlin", Res.drawable.Kotlin)
  map.put("compose_multiplatform", Res.drawable.compose_multiplatform)
  map.put("down", Res.drawable.down)
  map.put("java", Res.drawable.java)
  map.put("save_money", Res.drawable.save_money)
}
