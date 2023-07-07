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

public val NavBarIconPack.Connection: ImageVector
    get() {
        if (_connection != null) {
            return _connection!!
        }
        _connection = Builder(name = "Connection", defaultWidth = 24.0.dp, defaultHeight = 25.0.dp,
                viewportWidth = 24.0f, viewportHeight = 25.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFA49EB5)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.659f, 7.058f)
                curveTo(17.477f, 8.13f, 19.48f, 10.857f, 19.48f, 14.051f)
                curveTo(19.48f, 14.471f, 19.445f, 14.882f, 19.379f, 15.282f)
                moveTo(9.34f, 7.058f)
                curveTo(6.522f, 8.13f, 4.52f, 10.857f, 4.52f, 14.051f)
                curveTo(4.52f, 14.471f, 4.554f, 14.882f, 4.621f, 15.282f)
                moveTo(16.464f, 20.054f)
                curveTo(15.218f, 20.982f, 13.673f, 21.531f, 12.0f, 21.531f)
                curveTo(10.327f, 21.531f, 8.782f, 20.982f, 7.536f, 20.054f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFA49EB5)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 6.346f)
                moveToRelative(-2.799f, 0.0f)
                arcToRelative(2.799f, 2.799f, 0.0f, true, true, 5.598f, 0.0f)
                arcToRelative(2.799f, 2.799f, 0.0f, true, true, -5.598f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFA49EB5)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.448f, 17.983f)
                moveToRelative(-2.799f, 0.0f)
                arcToRelative(2.799f, 2.799f, 0.0f, true, true, 5.598f, 0.0f)
                arcToRelative(2.799f, 2.799f, 0.0f, true, true, -5.598f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFA49EB5)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.549f, 17.983f)
                moveToRelative(-2.799f, 0.0f)
                arcToRelative(2.799f, 2.799f, 0.0f, true, true, 5.598f, 0.0f)
                arcToRelative(2.799f, 2.799f, 0.0f, true, true, -5.598f, 0.0f)
            }
        }
        .build()
        return _connection!!
    }

private var _connection: ImageVector? = null
