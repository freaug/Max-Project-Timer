# Max-Project-Timer
A timer for how long a Max patch has been open. 

<h2>Use: </h2>
To use the object you need to do the following. 

Place <i><b>projTimer.class</b></i> and <i><b>projTimer.java</b></i> in the classes folder:

Cycling '74 > java > classes

Then just create a new <i><b>mxj projTimer</b></i> object.

For absolute accuracy I would recommend making a template that has <i><b>mxj projTimer</b></i> as a default object since time keeping will only occur when <i><b>mxj projTimer</b></i> has been instantiated. 

<ul>
  <li>Inlet 1 accepts a bang which will output the total time <i><b>mxj projTimer</b></i> has been instantiated in the format hours:minutes:seconds:millis to the Max Window and out of outlet 1</li>
  <li>Outlet 1 will display the total time <i><b>mxj projTimer</b></i> has been instantiated in the string format hours:minutes:seconds:millis</li>
</ul>

If you're curious about the code you can send a viewsource message to <i><b>mxj projTimer</b></i>.

<h2>Troubleshooting: </h2>

I've tested the template and mxj object with Max 6.1.10 on OS X Yosemite with no issues.  

If you have any issues the mxj reference is a good place to look: https://docs.cycling74.com/max5/refpages/max-ref/mxj.html or you can drop me a line ed.mc.farr@gmail.com

<h2>Todo: </h2>
This release is to get feedback for further development
<ul>
  <li>Save the overall project time inbetween sessions. Currently you need to record your time per session</li>
  <li>Output the total time as a text file, with the current date</li>
  <li>If the object is deleted save the time information. Currently deleting the object will reset the timer</li>
</ul>
  
