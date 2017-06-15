/*
 * Copyright 2017 Hippo Seven
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hippo.nimingban.scene

import android.view.View
import com.hippo.nimingban.REF_WATCHER
import com.hippo.nimingban.scene.ui.SceneUi

/*
 * Created by Hippo on 6/5/2017.
 */

abstract class DebugScene : UiScene() {

  override fun onDestroyView(view: View) {
    REF_WATCHER.watch(this.ui)
    super.onDestroyView(view)
    REF_WATCHER.watch(view)
  }

  override fun onDestroy() {
    super.onDestroy()
    REF_WATCHER.watch(this)
  }
}
