/*
 * Copyright (c) 2016 SnappyData, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You
 * may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License. See accompanying
 * LICENSE file.
 */
package org.apache.spark;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.sql.DataFrame;
import org.apache.spark.sql.DataFrameJavaFunctions;
import org.apache.spark.sql.DataFrameWriter;
import org.apache.spark.sql.DataFrameWriterJavaFunctions;


public class SnappyJavaUtils {

  /**
  *
   * A static factory method to create a {@link org.apache.spark.sql.DataFrameJavaFunctions} based on an existing {@link
   * DataFrame} instance.
   */
  public static DataFrameJavaFunctions snappyApis(DataFrame dataFrame) {
    return new DataFrameJavaFunctions(dataFrame);
  }

  /**
   *
   * A static factory method to create a {@link org.apache.spark.sql.DataFrameWriterJavaFunctions} based on an existing {@link
   * DataFrameWriter} instance.
   */
  public static DataFrameWriterJavaFunctions snappyApis(DataFrameWriter dataFrameWriter) {
    return new DataFrameWriterJavaFunctions(dataFrameWriter);
  }

  /**
   *
   * A static factory method to create a {@link org.apache.spark.RDDJavaFunctions} based on an existing {@link
   * JavaRDD} instance.
   */
  public static <T> RDDJavaFunctions<T> snappyApis(JavaRDD<T> rdd){
    return new RDDJavaFunctions(rdd);
  }

}