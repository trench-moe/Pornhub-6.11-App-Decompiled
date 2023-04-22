package com.google.vrtoolkit.cardboard;

import android.os.Build;
import android.util.Log;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.vrtoolkit.cardboard.proto.Phone;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import tc.c;

/* loaded from: classes.dex */
public class PhoneParams {
    private static final List<PpiOverride> PPI_OVERRIDES = Arrays.asList(new PpiOverride("Micromax", null, "4560MMX", null, 217, 217), new PpiOverride("HTC", "endeavoru", "HTC One X", null, 312, 312), new PpiOverride("samsung", null, "SM-N915FY", null, 541, 541), new PpiOverride("samsung", null, "SM-N915A", null, 541, 541), new PpiOverride("samsung", null, "SM-N915T", null, 541, 541), new PpiOverride("samsung", null, "SM-N915K", null, 541, 541), new PpiOverride("samsung", null, "SM-N915T", null, 541, 541), new PpiOverride("samsung", null, "SM-N915G", null, 541, 541), new PpiOverride("samsung", null, "SM-N915D", null, 541, 541), new PpiOverride("BLU", "BLU", "Studio 5.0 HD LTE", "qcom", 294, 294), new PpiOverride("OnePlus", "A0001", "A0001", "bacon", 401, 401));
    private static final int STREAM_SENTINEL = 779508118;
    private static final String TAG = "PhoneParams";

    /* loaded from: classes.dex */
    public static class PpiOverride {
        public String device;
        public String hardware;
        public String manufacturer;
        public String model;
        public int xPpi;
        public int yPpi;

        public PpiOverride(String str, String str2, String str3, String str4, int i10, int i11) {
            this.manufacturer = str;
            this.device = str2;
            this.model = str3;
            this.hardware = str4;
            this.xPpi = i10;
            this.yPpi = i11;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
            if (r6.equals(r7) == false) goto L6;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean isMatching(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            /*
                r5 = this;
                r1 = r5
                java.lang.String r0 = r1.manufacturer
                java.lang.String r3 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
                if (r0 == 0) goto Lf
                r4 = 4
                boolean r6 = r0.equals(r6)
                if (r6 == 0) goto L32
                r3 = 5
            Lf:
                java.lang.String r6 = r1.device
                if (r6 == 0) goto L19
                boolean r6 = r6.equals(r7)
                if (r6 == 0) goto L32
            L19:
                java.lang.String r6 = r1.model
                r3 = 3
                if (r6 == 0) goto L25
                boolean r6 = r6.equals(r8)
                if (r6 == 0) goto L32
                r4 = 1
            L25:
                java.lang.String r6 = r1.hardware
                r3 = 6
                if (r6 == 0) goto L35
                boolean r6 = r6.equals(r9)
                if (r6 == 0) goto L32
                r4 = 1
                goto L36
            L32:
                r4 = 7
                r6 = 0
                goto L37
            L35:
                r4 = 2
            L36:
                r6 = 1
            L37:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.vrtoolkit.cardboard.PhoneParams.PpiOverride.isMatching(java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
        }
    }

    private PhoneParams() {
    }

    public static boolean getPpiOverride(List<PpiOverride> list, String str, String str2, String str3, String str4, Phone.PhoneParams phoneParams) {
        Log.d(TAG, String.format("Override search for device: {MANUFACTURER=%s, DEVICE=%s, MODEL=%s, HARDWARE=%s}", str, str2, str3, str4));
        for (PpiOverride ppiOverride : list) {
            if (ppiOverride.isMatching(str, str2, str3, str4)) {
                Log.d(TAG, String.format("Found override: {MANUFACTURER=%s, DEVICE=%s, MODEL=%s, HARDWARE=%s} : x_ppi=%d, y_ppi=%d", ppiOverride.manufacturer, ppiOverride.device, ppiOverride.model, ppiOverride.hardware, Integer.valueOf(ppiOverride.xPpi), Integer.valueOf(ppiOverride.yPpi)));
                phoneParams.setXPpi(ppiOverride.xPpi);
                phoneParams.setYPpi(ppiOverride.yPpi);
                return true;
            }
        }
        return false;
    }

    public static Phone.PhoneParams readFromExternalStorage() {
        BufferedInputStream bufferedInputStream;
        try {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(ConfigUtils.getConfigFile(ConfigUtils.CARDBOARD_PHONE_PARAMS_FILE)));
                try {
                    Phone.PhoneParams readFromInputStream = readFromInputStream(bufferedInputStream);
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused) {
                    }
                    return readFromInputStream;
                } catch (Throwable th) {
                    th = th;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    try {
                        throw th;
                    } catch (FileNotFoundException e10) {
                        String str = TAG;
                        String valueOf = String.valueOf(e10);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 43);
                        sb2.append("Cardboard phone parameters file not found: ");
                        sb2.append(valueOf);
                        Log.d(str, sb2.toString());
                        return null;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = null;
            }
        } catch (IllegalStateException e11) {
            String str2 = TAG;
            String valueOf2 = String.valueOf(e11);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 32);
            sb3.append("Error reading phone parameters: ");
            sb3.append(valueOf2);
            Log.w(str2, sb3.toString());
        }
    }

    public static Phone.PhoneParams readFromInputStream(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            if (inputStream.read(allocate.array(), 0, allocate.array().length) == -1) {
                Log.e(TAG, "Error parsing param record: end of stream.");
                return null;
            }
            int i10 = allocate.getInt();
            int i11 = allocate.getInt();
            if (i10 != STREAM_SENTINEL) {
                Log.e(TAG, "Error parsing param record: incorrect sentinel.");
                return null;
            }
            byte[] bArr = new byte[i11];
            if (inputStream.read(bArr, 0, i11) == -1) {
                Log.e(TAG, "Error parsing param record: end of stream.");
                return null;
            }
            return (Phone.PhoneParams) c.mergeFrom(new Phone.PhoneParams(), bArr);
        } catch (InvalidProtocolBufferNanoException e10) {
            String str = TAG;
            String valueOf = String.valueOf(e10.toString());
            Log.w(str, valueOf.length() != 0 ? "Error parsing protocol buffer: ".concat(valueOf) : new String("Error parsing protocol buffer: "));
            return null;
        } catch (IOException e11) {
            String str2 = TAG;
            String valueOf2 = String.valueOf(e11.toString());
            Log.w(str2, valueOf2.length() != 0 ? "Error reading Cardboard parameters: ".concat(valueOf2) : new String("Error reading Cardboard parameters: "));
            return null;
        }
    }

    public static void registerOverrides() {
        registerOverridesInternal(PPI_OVERRIDES, Build.MANUFACTURER, Build.DEVICE, Build.MODEL, Build.HARDWARE);
    }

    public static void registerOverridesInternal(List<PpiOverride> list, String str, String str2, String str3, String str4) {
        Phone.PhoneParams readFromExternalStorage = readFromExternalStorage();
        Phone.PhoneParams phoneParams = readFromExternalStorage == null ? new Phone.PhoneParams() : readFromExternalStorage.mo10clone();
        if (!getPpiOverride(list, str, str2, str3, str4, phoneParams) || c.messageNanoEquals(readFromExternalStorage, phoneParams)) {
            return;
        }
        Log.i(TAG, "Applying phone param override.");
        writeToExternalStorage(phoneParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r0 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean writeToExternalStorage(com.google.vrtoolkit.cardboard.proto.Phone.PhoneParams r6) {
        /*
            r0 = 0
            r5 = 2
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L27 java.lang.IllegalStateException -> L29 java.io.FileNotFoundException -> L59
            r5 = 4
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L27 java.lang.IllegalStateException -> L29 java.io.FileNotFoundException -> L59
            java.lang.String r4 = "phone_params"
            r3 = r4
            java.io.File r4 = com.google.vrtoolkit.cardboard.ConfigUtils.getConfigFile(r3)     // Catch: java.lang.Throwable -> L27 java.lang.IllegalStateException -> L29 java.io.FileNotFoundException -> L59
            r3 = r4
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L27 java.lang.IllegalStateException -> L29 java.io.FileNotFoundException -> L59
            r5 = 2
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L27 java.lang.IllegalStateException -> L29 java.io.FileNotFoundException -> L59
            boolean r6 = writeToOutputStream(r6, r1)     // Catch: java.lang.Throwable -> L1e java.lang.IllegalStateException -> L21 java.io.FileNotFoundException -> L24
            r1.close()     // Catch: java.io.IOException -> L85
            goto L85
        L1e:
            r6 = move-exception
            r0 = r1
            goto L86
        L21:
            r6 = move-exception
            r0 = r1
            goto L2a
        L24:
            r6 = move-exception
            r0 = r1
            goto L5a
        L27:
            r6 = move-exception
            goto L86
        L29:
            r6 = move-exception
        L2a:
            r5 = 2
            java.lang.String r1 = com.google.vrtoolkit.cardboard.PhoneParams.TAG     // Catch: java.lang.Throwable -> L27
            r5 = 4
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r5 = 1
            int r4 = r6.length()     // Catch: java.lang.Throwable -> L27
            r3 = r4
            int r3 = r3 + 32
            r5 = 6
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L27
            r5 = 2
            java.lang.String r4 = "Error writing phone parameters: "
            r3 = r4
            r2.append(r3)     // Catch: java.lang.Throwable -> L27
            r2.append(r6)     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L27
            r6 = r4
            android.util.Log.w(r1, r6)     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L83
        L54:
            r5 = 4
            r0.close()     // Catch: java.io.IOException -> L83
            goto L83
        L59:
            r6 = move-exception
        L5a:
            r5 = 3
            java.lang.String r1 = com.google.vrtoolkit.cardboard.PhoneParams.TAG     // Catch: java.lang.Throwable -> L27
            r5 = 5
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L27
            r6 = r4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            int r4 = r6.length()     // Catch: java.lang.Throwable -> L27
            r3 = r4
            int r3 = r3 + 37
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = "Unexpected file not found exception: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L27
            r2.append(r6)     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L27
            r6 = r4
            android.util.Log.e(r1, r6)     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L83
            r5 = 3
            goto L54
        L83:
            r6 = 0
            r5 = 3
        L85:
            return r6
        L86:
            if (r0 == 0) goto L8c
            r5 = 1
            r0.close()     // Catch: java.io.IOException -> L8c
        L8c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.vrtoolkit.cardboard.PhoneParams.writeToExternalStorage(com.google.vrtoolkit.cardboard.proto.Phone$PhoneParams):boolean");
    }

    public static boolean writeToOutputStream(Phone.PhoneParams phoneParams, OutputStream outputStream) {
        Phone.PhoneParams phoneParams2 = phoneParams;
        try {
            float[] fArr = phoneParams2.dEPRECATEDGyroBias;
            if (fArr != null && fArr.length == 0) {
                phoneParams2 = phoneParams2.mo10clone();
                phoneParams2.dEPRECATEDGyroBias = new float[]{0.0f, 0.0f, 0.0f};
            }
            byte[] byteArray = c.toByteArray(phoneParams2);
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(STREAM_SENTINEL);
            allocate.putInt(byteArray.length);
            outputStream.write(allocate.array());
            outputStream.write(byteArray);
            return true;
        } catch (IOException e10) {
            String str = TAG;
            String valueOf = String.valueOf(e10.toString());
            Log.w(str, valueOf.length() != 0 ? "Error writing phone parameters: ".concat(valueOf) : new String("Error writing phone parameters: "));
            return false;
        }
    }
}
