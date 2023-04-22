package d0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class h {
    public static boolean a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, boolean z10) {
        return !f(xmlPullParser, str) ? z10 : typedArray.getBoolean(i10, z10);
    }

    public static c b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10, int i11) {
        c cVar;
        if (f(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i12 = typedValue.type;
            if (i12 >= 28 && i12 <= 31) {
                return new c(null, null, typedValue.data);
            }
            try {
                cVar = c.a(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            } catch (Exception e10) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
                cVar = null;
            }
            if (cVar != null) {
                return cVar;
            }
        }
        return new c(null, null, i11);
    }

    public static float c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, float f10) {
        return !f(xmlPullParser, str) ? f10 : typedArray.getFloat(i10, f10);
    }

    public static int d(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        return !f(xmlPullParser, str) ? i11 : typedArray.getInt(i10, i11);
    }

    public static String e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10) {
        if (f(xmlPullParser, str)) {
            return typedArray.getString(i10);
        }
        return null;
    }

    public static boolean f(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
