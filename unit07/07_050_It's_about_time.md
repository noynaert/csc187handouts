# 07.050 It's About Time

Dates and times are hard.  

Most early computer languages did not explicitly represent dates.  They would either use three separate variables for month, day, and year, or they would use strings.  It was up to the programmer (or the shop) to develop functions to manipulate strings.

## About Dates

Dates can be handled fairly easily as long as dates are handled "locally."  A program was usually written to be used by a company in one country or region.  The conventions about dates in that region could be coded into the programs.

### International Dates

* US uses mm/dd/yyyy format
* Many places in Europe use dd/mm/yyyy

#### Problems

* Is 04/02/2020 April 2 or February 4?
* Neither form is easy to sort.

#### ISO 8601 Standard for dates and times

##### 2023-09-01   Year-Month-Day

* It sorts alphabetically
* Doesn't favor either the European or the US standard

## Epoch

* Java uses Unix time.
* The Unix epoch began on January 1, 1970
* Time is counted in seconds.

The number of seconds is counted in seconds.  Originally this was stored in a 32-bit unsigned integer.  So the original system only worked for a little over 4 billion seconds.

## 2038 the Epochocolypse or the Y2038 problem

* There have already been some problems
* 64-bit time allows for times up to a maximum date about 20 times longer than the age of the universe.
* Most of the problems are likely to be handled.  But there may still be some, especially older file systems.
* Some of the extra bits are used to store time in milliseconds and nanoseconds.

## Terms

* Epoch (measuring time from midnight on January 1, 1970)
* Millisecond   There are a thousand milliseconds in a second.
* Nanosecond There are a billion nanoseconds in a second.

## Time Zones

* Time Zones are based on 0 longitude.  It goes through Greenich, England.
* Time Zones to the west of England are negative.  Zones to the east are positive.
* Central Time is GMT -6.  
* Central Daylight Savings Time is GMT -5.
