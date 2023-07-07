package edu.kaist.cs.teamfinder.navbariconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import edu.kaist.cs.teamfinder.NavBarIconPack

val NavBarIconPack.Save: ImageVector
    get() {
        if (_save != null) {
            return _save!!
        }
        _save = Builder(name = "Save", defaultWidth = 24.0.dp, defaultHeight = 25.0.dp,
                viewportWidth = 24.0f, viewportHeight = 25.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFA49EB5)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.377f, 17.313f)
                lineTo(12.0f, 17.094f)
                lineTo(11.623f, 17.313f)
                lineTo(5.454f, 20.898f)
                curveTo(5.288f, 20.995f, 5.079f, 20.874f, 5.079f, 20.682f)
                verticalLineTo(5.604f)
                curveTo(5.079f, 4.361f, 6.086f, 3.354f, 7.329f, 3.354f)
                horizontalLineTo(16.671f)
                curveTo(17.914f, 3.354f, 18.921f, 4.361f, 18.921f, 5.604f)
                verticalLineTo(20.682f)
                curveTo(18.921f, 20.874f, 18.712f, 20.995f, 18.546f, 20.898f)
                lineTo(12.377f, 17.313f)
                close()
            }
        }
        .build()
        return _save!!
    }

private var _save: ImageVector? = null
