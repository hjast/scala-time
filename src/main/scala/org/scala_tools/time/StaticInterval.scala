/**
 * Copyright 2009 Jorge Ortiz
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
 *
 **/
package org.scala_tools.time

import org.scala_tools.time.Implicits._
import org.joda.time._

object StaticInterval extends StaticInterval

trait StaticInterval {
  def thisSecond = StaticDateTime.now.second.toInterval
  def thisMinute = StaticDateTime.now.minute.toInterval
  def thisHour   = StaticDateTime.now.hour.toInterval
  def thisDay    = StaticDateTime.now.day.toInterval
  def today      = StaticDateTime.now.day.toInterval
  def thisWeek   = StaticDateTime.now.week.toInterval
  def thisMonth  = StaticDateTime.now.month.toInterval
  def thisYear   = StaticDateTime.now.year.toInterval

  def nextSecond = StaticDateTime.nextSecond.second.toInterval
  def nextMinute = StaticDateTime.nextMinute.minute.toInterval
  def nextHour   = StaticDateTime.nextHour.hour.toInterval
  def nextDay    = StaticDateTime.nextDay.day.toInterval
  def tomorrow   = StaticDateTime.nextDay.day.toInterval
  def nextWeek   = StaticDateTime.nextWeek.week.toInterval
  def nextMonth  = StaticDateTime.nextMonth.month.toInterval
  def nextYear   = StaticDateTime.nextYear.year.toInterval

  def lastSecond = StaticDateTime.lastSecond.second.toInterval
  def lastMinute = StaticDateTime.lastMinute.minute.toInterval
  def lastHour   = StaticDateTime.lastHour.hour.toInterval
  def lastDay    = StaticDateTime.lastDay.day.toInterval
  def yesterday  = StaticDateTime.lastDay.day.toInterval
  def lastWeek   = StaticDateTime.lastWeek.week.toInterval
  def lastMonth  = StaticDateTime.lastMonth.month.toInterval
  def lastYear   = StaticDateTime.lastYear.year.toInterval
}
