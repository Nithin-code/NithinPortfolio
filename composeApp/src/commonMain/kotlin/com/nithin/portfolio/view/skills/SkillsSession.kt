package com.nithin.portfolio.view.skills




import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nithin.portfolio.model.HomeData
import com.nithin.portfolio.utils.DeviceType
import com.nithin.portfolio.utils.Divider
import com.nithin.portfolio.utils.PrimaryAccent
import com.nithin.portfolio.utils.SurfaceBackGround
import com.nithin.portfolio.utils.TextType
import com.nithin.portfolio.utils.UbuntuMedium
import com.nithin.portfolio.utils.UbuntuRegular
import com.nithin.portfolio.view.components.ResponsiveText

@Composable
fun SkillsSession(
    homeData: HomeData,
    modifier: Modifier = Modifier,
    title: String = "",
    deviceType: DeviceType,
) {

    Surface(
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(
            width = 1.dp,
            color = Divider
        ),
        color = SurfaceBackGround
    ) {


        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {


            ResponsiveText(
                title = title,
                font = UbuntuMedium(),
                deviceType = deviceType,
                textType = TextType.HEADING
            )


            FlowRow(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {

                homeData.skills.forEach { skillDetails->
                    Surface(
                        shape = RoundedCornerShape(16.dp),
                        border = BorderStroke(width = 1.dp, color = PrimaryAccent),
                        color = SurfaceBackGround
                    ) {

                        ResponsiveText(
                            modifier = Modifier.padding(8.dp),
                            title = skillDetails,
                            font = UbuntuRegular(),
                            deviceType = deviceType,
                            textType = TextType.BUTTON,
                            textColor = PrimaryAccent
                        )

                    }
                }



            }

        }
    }


}