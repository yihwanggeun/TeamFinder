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

val NavBarIconPack.Chat: ImageVector
    get() {
        if (_chat != null) {
            return _chat!!
        }
        _chat = Builder(name = "Chat", defaultWidth = 24.0.dp, defaultHeight = 25.0.dp,
                viewportWidth = 24.0f, viewportHeight = 25.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFFFF9228)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.75f, 6.512f)
                curveTo(2.75f, 5.269f, 3.757f, 4.262f, 5.0f, 4.262f)
                horizontalLineTo(19.0f)
                curveTo(20.243f, 4.262f, 21.25f, 5.269f, 21.25f, 6.512f)
                verticalLineTo(15.512f)
                curveTo(21.25f, 16.754f, 20.243f, 17.762f, 19.0f, 17.762f)
                horizontalLineTo(15.207f)
                curveTo(14.876f, 17.762f, 14.558f, 17.893f, 14.323f, 18.128f)
                lineTo(12.0f, 20.451f)
                lineTo(9.677f, 18.128f)
                curveTo(9.442f, 17.893f, 9.124f, 17.762f, 8.793f, 17.762f)
                horizontalLineTo(5.0f)
                curveTo(3.757f, 17.762f, 2.75f, 16.754f, 2.75f, 15.512f)
                verticalLineTo(6.512f)
                close()
            }
        }
        .build()
        return _chat!!
    }

private var _chat: ImageVector? = null
