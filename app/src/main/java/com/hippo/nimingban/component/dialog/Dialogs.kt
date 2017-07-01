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

package com.hippo.nimingban.component.dialog

import android.os.Bundle
import com.hippo.stage.Scene

/*
 * Created by Hippo on 6/30/2017.
 */

fun selectForumDialog(target: Scene): SelectForumDialog {
  val dialog = SelectForumDialog()
  dialog.target = target
  return dialog
}

fun goToDialog(target: Scene, min: Int, max: Int, progress: Int): GoToDialog {
  val args = Bundle()
  args.putInt(GoToDialog.KEY_MIN, min)
  args.putInt(GoToDialog.KEY_MAX, max)
  args.putInt(GoToDialog.KEY_PROGRESS, progress)
  val dialog = GoToDialog()
  dialog.args = args
  dialog.target = target
  return dialog
}