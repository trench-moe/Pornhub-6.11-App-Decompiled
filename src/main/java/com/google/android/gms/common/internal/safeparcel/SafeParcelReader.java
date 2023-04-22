package com.google.android.gms.common.internal.safeparcel;

import a1.a;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class SafeParcelReader {

    /* loaded from: classes.dex */
    public static class ParseException extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public ParseException(java.lang.String r4, android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                int r1 = r1 + 41
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static Bundle a(Parcel parcel, int i10) {
        int s10 = s(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (s10 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + s10);
        return readBundle;
    }

    public static byte[] b(Parcel parcel, int i10) {
        int s10 = s(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (s10 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + s10);
        return createByteArray;
    }

    public static int[] c(Parcel parcel, int i10) {
        int s10 = s(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (s10 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + s10);
        return createIntArray;
    }

    public static long[] d(Parcel parcel, int i10) {
        int s10 = s(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (s10 == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + s10);
        return createLongArray;
    }

    public static <T extends Parcelable> T e(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int s10 = s(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (s10 == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + s10);
        return createFromParcel;
    }

    public static String f(Parcel parcel, int i10) {
        int s10 = s(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (s10 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + s10);
        return readString;
    }

    public static String[] g(Parcel parcel, int i10) {
        int s10 = s(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (s10 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + s10);
        return createStringArray;
    }

    public static ArrayList<String> h(Parcel parcel, int i10) {
        int s10 = s(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (s10 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + s10);
        return createStringArrayList;
    }

    public static <T> T[] i(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int s10 = s(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (s10 == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + s10);
        return tArr;
    }

    public static <T> ArrayList<T> j(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int s10 = s(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (s10 == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + s10);
        return createTypedArrayList;
    }

    public static void k(Parcel parcel, int i10) {
        if (parcel.dataPosition() != i10) {
            throw new ParseException(b.e(37, "Overread allowed size end=", i10), parcel);
        }
    }

    public static boolean l(Parcel parcel, int i10) {
        w(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean m(Parcel parcel, int i10) {
        int s10 = s(parcel, i10);
        if (s10 == 0) {
            return null;
        }
        v(parcel, i10, s10, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static double n(Parcel parcel, int i10) {
        w(parcel, i10, 8);
        return parcel.readDouble();
    }

    public static float o(Parcel parcel, int i10) {
        w(parcel, i10, 4);
        return parcel.readFloat();
    }

    public static IBinder p(Parcel parcel, int i10) {
        int s10 = s(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (s10 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + s10);
        return readStrongBinder;
    }

    public static int q(Parcel parcel, int i10) {
        w(parcel, i10, 4);
        return parcel.readInt();
    }

    public static long r(Parcel parcel, int i10) {
        w(parcel, i10, 8);
        return parcel.readLong();
    }

    public static int s(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void t(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + s(parcel, i10));
    }

    public static int u(Parcel parcel) {
        int readInt = parcel.readInt();
        int s10 = s(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if (((char) readInt) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            throw new ParseException(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i10 = s10 + dataPosition;
        if (i10 < dataPosition || i10 > parcel.dataSize()) {
            throw new ParseException(a.h(54, "Size read is invalid start=", dataPosition, " end=", i10), parcel);
        }
        return i10;
    }

    public static void v(Parcel parcel, int i10, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        String hexString = Integer.toHexString(i11);
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb2.append("Expected size ");
        sb2.append(i12);
        sb2.append(" got ");
        sb2.append(i11);
        throw new ParseException(b.n(sb2, " (0x", hexString, ")"), parcel);
    }

    public static void w(Parcel parcel, int i10, int i11) {
        int s10 = s(parcel, i10);
        if (s10 == i11) {
            return;
        }
        String hexString = Integer.toHexString(s10);
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb2.append("Expected size ");
        sb2.append(i11);
        sb2.append(" got ");
        sb2.append(s10);
        throw new ParseException(b.n(sb2, " (0x", hexString, ")"), parcel);
    }
}
