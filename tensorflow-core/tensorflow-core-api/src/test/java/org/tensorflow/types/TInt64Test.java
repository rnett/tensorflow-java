/*
 *  Copyright 2019 The TensorFlow Authors. All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  =======================================================================
 */

package org.tensorflow.types;

import org.tensorflow.TensorScope;
import org.tensorflow.ndarray.NdArray;
import org.tensorflow.ndarray.NdArrays;
import org.tensorflow.ndarray.Shape;

public class TInt64Test extends NumericTypesTestBase<TInt64, Long> {

  @Override
  TInt64 allocateTensor(TensorScope scope, Shape shape) {
    return TInt64.tensorOf(scope, shape);
  }

  @Override
  NdArray<Long> allocateNdArray(Shape shape) {
    return NdArrays.ofLongs(shape);
  }

  @Override
  Long valueOf(Integer value) {
    return value.longValue();
  }
}
