/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.wear.watchface.data

import androidx.annotation.IntDef
import androidx.annotation.RestrictTo

/** @hide */
@IntDef(
    value = [
        ComplicationBoundsType.ROUND_RECT,
        ComplicationBoundsType.BACKGROUND,
        ComplicationBoundsType.EDGE
    ]
)
@RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
annotation class ComplicationBoundsType {
    companion object {
        /** The default, most complications are either circular or rounded rectangles. */
        const val ROUND_RECT = 0

        /** For full screen image complications drawn behind the watch face. */
        const val BACKGROUND = 1

        /** For edge of screen complications. */
        const val EDGE = 2
    }
}