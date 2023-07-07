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

public val NavBarIconPack.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 24.0.dp, defaultHeight = 25.0.dp,
                viewportWidth = 24.0f, viewportHeight = 25.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFA49EB5)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.917f, 15.222f)
                verticalLineTo(20.512f)
                curveTo(18.917f, 21.202f, 18.357f, 21.762f, 17.667f, 21.762f)
                horizontalLineTo(14.417f)
                verticalLineTo(17.614f)
                curveTo(14.417f, 16.647f, 13.633f, 15.864f, 12.667f, 15.864f)
                horizontalLineTo(11.333f)
                curveTo(10.367f, 15.864f, 9.583f, 16.647f, 9.583f, 17.614f)
                verticalLineTo(21.762f)
                horizontalLineTo(6.333f)
                curveTo(5.643f, 21.762f, 5.083f, 21.202f, 5.083f, 20.512f)
                verticalLineTo(15.222f)
                curveTo(5.083f, 14.776f, 4.722f, 14.415f, 4.276f, 14.415f)
                horizontalLineTo(4.252f)
                curveTo(3.423f, 14.415f, 2.75f, 13.742f, 2.75f, 12.913f)
                curveTo(2.75f, 12.527f, 2.898f, 12.156f, 3.164f, 11.877f)
                lineTo(11.103f, 3.542f)
                curveTo(11.593f, 3.026f, 12.415f, 3.024f, 12.908f, 3.537f)
                lineTo(20.809f, 11.744f)
                curveTo(21.092f, 12.038f, 21.25f, 12.43f, 21.25f, 12.838f)
                verticalLineTo(12.888f)
                curveTo(21.25f, 13.731f, 20.567f, 14.415f, 19.724f, 14.415f)
                curveTo(19.278f, 14.415f, 18.917f, 14.776f, 18.917f, 15.222f)
                close()
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
