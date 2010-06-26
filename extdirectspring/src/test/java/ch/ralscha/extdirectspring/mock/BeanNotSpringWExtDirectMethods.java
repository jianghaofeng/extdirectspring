/**
 * Copyright 2010 Ralph Schaer <ralphschaer@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ch.ralscha.extdirectspring.mock;

import java.util.List;
import ch.ralscha.extdirectspring.annotation.ExtDirectMethod;
import ch.ralscha.extdirectspring.annotation.ExtDirectPollMethod;
import ch.ralscha.extdirectspring.annotation.ExtDirectStoreModifyMethod;
import ch.ralscha.extdirectspring.annotation.ExtDirectStoreReadMethod;

public class BeanNotSpringWExtDirectMethods {

  @ExtDirectMethod
  public void methodA() {
    //a dummy method
  }

  @ExtDirectPollMethod
  public void methodB() {
    //a dummy method
  }

  @ExtDirectStoreModifyMethod(type = Integer.class)
  public List<Integer> methodC(List<Integer> ids) {
    //a dummy method
    return null;
  }

  @ExtDirectStoreReadMethod
  public List<Integer> methodD() {
    //a dummy method
    return null;
  }
}
