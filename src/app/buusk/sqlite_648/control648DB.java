package app.buusk.sqlite_648;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class control648DB extends SQLiteOpenHelper {
	private static final String DATABASE_NAME = "mydata648";
	private static final String TABLE_MEMBER = "members";
	private static final int DATABASE_VERSION = 1;

	public control648DB(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL("CREATE TABLE " + TABLE_MEMBER
				+ "(MemberID INTEGER PRIMARY KEY AUTOINCREMENT,"
				+ "NickName TEXT(100)," + "Age TEXT(100)," + "Height TEXT(100),"
				+ "Weight TEXT(100)," + "Country TEXT(100),"
				+ "Tel TEXT(100));");

		Log.d("CREATE TABLE", "Create table Successfully");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL("DROP TABLE OF EXISTS " + TABLE_MEMBER);
		onCreate(db);

	}

	public long InsertData(String strNickName, String strAge, String strHeight,
			String strWeight, String strCountry, String strTel) {
		try {
			SQLiteDatabase db;
			db = this.getWritableDatabase();
			ContentValues values = new ContentValues();
			values.put("NickName", strNickName);
			values.put("Age", strAge);
			values.put("Height", strHeight);
			values.put("Weight", strWeight);
			values.put("Country", strCountry);
			values.put("Tel", strTel);
			long l = db.insert(TABLE_MEMBER, null, values);
			db.close();
			return l;
		} catch (Exception c) {

		}
		return -1;
	}

}