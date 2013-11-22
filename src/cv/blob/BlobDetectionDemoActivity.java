package cv.blob;

import java.io.IOException;
import java.io.InputStream;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class BlobDetectionDemoActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
	 super.onCreate(savedInstanceState) ;
		 
	 setContentView(R.layout.main);
     
     TextView textViewInfo = (TextView) findViewById(R.id.textView);
     textViewInfo.setText("");
     ImageView imageViewShower = (ImageView) findViewById(R.id.imageView);
     Bitmap bitmap = loadAssetBitmap(this, "img2.png");
     
     BlobDetection blob = new BlobDetection(bitmap);
     Bitmap anotherBitmap = blob.getBlob(bitmap);
     BitmapDrawable bitmapDrawable = new BitmapDrawable(anotherBitmap);
     imageViewShower.setBackgroundDrawable(bitmapDrawable);
     textViewInfo.setText("Found "+blob.blobList.size()+" blobs:\n");
     System.out.printf("Found %d blobs:\n", blob.blobList.size());
		for (BlobDetection.Blob blobies : blob.blobList)  {
			System.out.println(blobies);
			 textViewInfo.setText(textViewInfo.getText() +" " +  blobies+"\n");
		}
			
	}
	
	public static Bitmap loadAssetBitmap(Context c, String fileName)
	{
		Bitmap result = null;
		try
		{
			InputStream inputStream = c.getAssets().open(fileName);
			result = BitmapFactory.decodeStream(inputStream);
			inputStream.close();
		}
		catch (IOException e)
		{
			Log.e(BlobDetectionDemoActivity.class.getName(), "IOException opening file. " + e);
			e.printStackTrace();
		}
		return result;
	}
}
