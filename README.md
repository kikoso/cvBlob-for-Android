cvBlob-for-Android
==================

cvBlob is a library designed specifically for Android, in order to perform blob detection and extraction. The library has been designed based on a single-pass algorithm, detecting first the blobs, and then labeling and optimizing them.

I used as a base the Java algorithm proposed by Dr. Andrew Greensted, although I soon realized that the implementation was not suitable for Android based-phones. With the library there is a sample application provided, so you can check the basics.

If you have any comment about the library, feel free to contact me at eenriquelopez@gmail.com

You can access further information about [labeling tables][1] and [labeling][2].

You can download an [APK demo][3] or the [full library][4]

Remember that in order to use the library, you have to add to your project as a library. In order to accomplish that, you should add it on the target project, under "Properties -> Android -> Add Library"

![Screenshot][5]

Acknowledgements
--------------------
* [Dr. Andrew Greensted][6], who designed the based Java algorithm I used for my implementation.


Usage
--------------------
Being the "variable" bitmap a Bitmap, proceed as follows:

    BlobDetection blob = new BlobDetection(bitmap);
    Bitmap anotherBitmap = blob.getBlob(bitmap);
    
The variable "blobList" contains information about all the blobs found


Developed By
--------------------

Enrique López Mañas - <eenriquelopez@gmail.com>

<a href="https://twitter.com/eenriquelopez">
  <img alt="Follow me on Twitter"
       src="https://raw.github.com/kikoso/android-stackblur/master/art/twitter.png" />
</a>
<a href="https://plus.google.com/103250453274111396206">
  <img alt="Follow me on Google+"
       src="https://raw.github.com/kikoso/android-stackblur/master/art/google-plus.png" />
</a>
<a href="http://de.linkedin.com/pub/enrique-l%C3%B3pez-ma%C3%B1as/15/4a9/876">
  <img alt="Follow me on LinkedIn"
       src="https://raw.github.com/kikoso/android-stackblur/master/art/linkedin.png" />
       
[1]: https://github.com/kikoso/cvBlob-for-Android/wiki/Labeling-tables
[2]: https://github.com/kikoso/cvBlob-for-Android/wiki/Labeling
[3]: https://code.google.com/p/cvblob-for-android/downloads/detail?name=cvBlobDetection.zip&can=2&q=
[4]: https://code.google.com/p/cvblob-for-android/downloads/detail?name=cvBlobDetectionDemo.apk&can=2&q=
[5]: https://raw.github.com/kikoso/cvBlob-for-Android/master/art/screenshot.png
[6]: http://www.elec.york.ac.uk/staff/ajg112.html
[7]: https://github.com/kikoso/android-stackblur/tree/master/StackBlur
