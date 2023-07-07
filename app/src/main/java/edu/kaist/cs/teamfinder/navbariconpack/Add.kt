package edu.kaist.cs.teamfinder.navbariconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import edu.kaist.cs.teamfinder.NavBarIconPack

public val NavBarIconPack.Add: ImageVector
    get() {
        if (_add != null) {
            return _add!!
        }
        _add = Builder(name = "Add", defaultWidth = 160.0.dp, defaultHeight = 120.0.dp,
                viewportWidth = 160.0f, viewportHeight = 120.0f).apply {
            path(fill = SolidColor(Color(0xFF130160)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 76.0f)
                moveToRelative(-18.0f, 0.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 36.0f, 0.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, -36.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(80.0f, 71.0f)
                verticalLineTo(81.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFffffff)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(85.0f, 76.0f)
                lineTo(75.0f, 76.0f)
            }
        }
        .build()
        return _add!!
    }

private var _add: ImageVector? = null
