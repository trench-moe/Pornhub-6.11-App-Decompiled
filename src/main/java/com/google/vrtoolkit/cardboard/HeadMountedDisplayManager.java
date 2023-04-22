package com.google.vrtoolkit.cardboard;

import android.content.Context;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public class HeadMountedDisplayManager {
    private static final String TAG = "HeadMountedDisplayManager";
    private final Context context;
    private final HeadMountedDisplay hmd = new HeadMountedDisplay(createScreenParams(), createCardboardDeviceParams());

    public HeadMountedDisplayManager(Context context) {
        this.context = context;
    }

    private CardboardDeviceParams createCardboardDeviceParams() {
        CardboardDeviceParams createCardboardDeviceParamsFromExternalStorage = createCardboardDeviceParamsFromExternalStorage();
        if (createCardboardDeviceParamsFromExternalStorage != null) {
            Log.i(TAG, "Successfully read device params from external storage");
            return createCardboardDeviceParamsFromExternalStorage;
        }
        CardboardDeviceParams createCardboardDeviceParamsFromAssetFolder = createCardboardDeviceParamsFromAssetFolder();
        if (createCardboardDeviceParamsFromAssetFolder != null) {
            Log.i(TAG, "Successfully read device params from asset folder");
            writeCardboardParamsToExternalStorage();
            return createCardboardDeviceParamsFromAssetFolder;
        }
        return new CardboardDeviceParams();
    }

    private CardboardDeviceParams createCardboardDeviceParamsFromAssetFolder() {
        BufferedInputStream bufferedInputStream;
        try {
            try {
                bufferedInputStream = new BufferedInputStream(ConfigUtils.openAssetConfigFile(this.context.getAssets(), ConfigUtils.CARDBOARD_DEVICE_PARAMS_FILE));
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = null;
            }
            try {
                CardboardDeviceParams createFromInputStream = CardboardDeviceParams.createFromInputStream(bufferedInputStream);
                bufferedInputStream.close();
                return createFromInputStream;
            } catch (Throwable th2) {
                th = th2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                throw th;
            }
        } catch (FileNotFoundException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 47);
            sb2.append("Bundled Cardboard device parameters not found: ");
            sb2.append(valueOf);
            Log.d(TAG, sb2.toString());
            return null;
        } catch (IOException e11) {
            String valueOf2 = String.valueOf(e11);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 43);
            sb3.append("Error reading config file in asset folder: ");
            sb3.append(valueOf2);
            Log.e(TAG, sb3.toString());
            return null;
        }
    }

    private CardboardDeviceParams createCardboardDeviceParamsFromExternalStorage() {
        BufferedInputStream bufferedInputStream;
        try {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(ConfigUtils.getConfigFile(ConfigUtils.CARDBOARD_DEVICE_PARAMS_FILE)));
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = null;
            }
            try {
                CardboardDeviceParams createFromInputStream = CardboardDeviceParams.createFromInputStream(bufferedInputStream);
                try {
                    bufferedInputStream.close();
                } catch (IOException unused) {
                }
                return createFromInputStream;
            } catch (Throwable th2) {
                th = th2;
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                try {
                    throw th;
                } catch (FileNotFoundException e10) {
                    String valueOf = String.valueOf(e10);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 44);
                    sb2.append("Cardboard device parameters file not found: ");
                    sb2.append(valueOf);
                    Log.d(TAG, sb2.toString());
                    return null;
                }
            }
        } catch (IllegalStateException e11) {
            String valueOf2 = String.valueOf(e11);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 43);
            sb3.append("Error reading Cardboard device parameters: ");
            sb3.append(valueOf2);
            Log.w(TAG, sb3.toString());
            return null;
        }
    }

    private ScreenParams createScreenParams() {
        Display display = getDisplay();
        ScreenParams createScreenParamsFromExternalStorage = createScreenParamsFromExternalStorage(display);
        if (createScreenParamsFromExternalStorage != null) {
            Log.i(TAG, "Successfully read screen params from external storage");
            return createScreenParamsFromExternalStorage;
        }
        return new ScreenParams(display);
    }

    private ScreenParams createScreenParamsFromExternalStorage(Display display) {
        BufferedInputStream bufferedInputStream;
        try {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(ConfigUtils.getConfigFile(ConfigUtils.CARDBOARD_PHONE_PARAMS_FILE)));
                try {
                    ScreenParams createFromInputStream = ScreenParams.createFromInputStream(display, bufferedInputStream);
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused) {
                    }
                    return createFromInputStream;
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
                        String valueOf = String.valueOf(e10);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 44);
                        sb2.append("Cardboard screen parameters file not found: ");
                        sb2.append(valueOf);
                        Log.d(TAG, sb2.toString());
                        return null;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = null;
            }
        } catch (IllegalStateException e11) {
            String valueOf2 = String.valueOf(e11);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 43);
            sb3.append("Error reading Cardboard screen parameters: ");
            sb3.append(valueOf2);
            Log.w(TAG, sb3.toString());
        }
    }

    private Display getDisplay() {
        return ((WindowManager) this.context.getSystemService("window")).getDefaultDisplay();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
        if (r2 == null) goto L20;
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x009f: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:33:0x009f */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeCardboardParamsToExternalStorage() {
        /*
            r9 = this;
            java.lang.String r6 = "HeadMountedDisplayManager"
            r0 = r6
            r6 = 0
            r1 = r6
            r8 = 6
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L31 java.lang.IllegalStateException -> L33 java.io.FileNotFoundException -> L61
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L31 java.lang.IllegalStateException -> L33 java.io.FileNotFoundException -> L61
            r8 = 5
            java.lang.String r4 = "current_device_params"
            r7 = 5
            java.io.File r6 = com.google.vrtoolkit.cardboard.ConfigUtils.getConfigFile(r4)     // Catch: java.lang.Throwable -> L31 java.lang.IllegalStateException -> L33 java.io.FileNotFoundException -> L61
            r4 = r6
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L31 java.lang.IllegalStateException -> L33 java.io.FileNotFoundException -> L61
            r7 = 6
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L31 java.lang.IllegalStateException -> L33 java.io.FileNotFoundException -> L61
            r7 = 4
            com.google.vrtoolkit.cardboard.HeadMountedDisplay r1 = r9.hmd     // Catch: java.lang.IllegalStateException -> L2d java.io.FileNotFoundException -> L2f java.lang.Throwable -> L9e
            r7 = 6
            com.google.vrtoolkit.cardboard.CardboardDeviceParams r1 = r1.getCardboardDeviceParams()     // Catch: java.lang.IllegalStateException -> L2d java.io.FileNotFoundException -> L2f java.lang.Throwable -> L9e
            boolean r1 = r1.writeToOutputStream(r2)     // Catch: java.lang.IllegalStateException -> L2d java.io.FileNotFoundException -> L2f java.lang.Throwable -> L9e
            r2.close()     // Catch: java.io.IOException -> L2a
            goto L8d
        L2a:
            r7 = 2
            goto L8d
        L2d:
            r1 = move-exception
            goto L37
        L2f:
            r1 = move-exception
            goto L65
        L31:
            r0 = move-exception
            goto La0
        L33:
            r2 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
        L37:
            r8 = 3
            java.lang.String r6 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L9e
            r1 = r6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9e
            r8 = 4
            int r4 = r1.length()     // Catch: java.lang.Throwable -> L9e
            int r4 = r4 + 32
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L9e
            r7 = 4
            java.lang.String r4 = "Error writing phone parameters: "
            r8 = 1
            r3.append(r4)     // Catch: java.lang.Throwable -> L9e
            r3.append(r1)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L9e
            android.util.Log.w(r0, r1)     // Catch: java.lang.Throwable -> L9e
            if (r2 == 0) goto L8a
            r7 = 4
        L5d:
            r2.close()     // Catch: java.io.IOException -> L8a
            goto L8b
        L61:
            r2 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
        L65:
            r7 = 3
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L9e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9e
            int r4 = r1.length()     // Catch: java.lang.Throwable -> L9e
            int r4 = r4 + 37
            r7 = 3
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r4 = "Unexpected file not found exception: "
            r8 = 3
            r3.append(r4)     // Catch: java.lang.Throwable -> L9e
            r3.append(r1)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L9e
            r1 = r6
            android.util.Log.e(r0, r1)     // Catch: java.lang.Throwable -> L9e
            if (r2 == 0) goto L8a
            goto L5d
        L8a:
            r8 = 2
        L8b:
            r6 = 0
            r1 = r6
        L8d:
            if (r1 != 0) goto L97
            r8 = 5
            java.lang.String r1 = "Could not write Cardboard parameters to external storage."
            r8 = 2
            android.util.Log.e(r0, r1)
            goto L9d
        L97:
            java.lang.String r1 = "Successfully wrote Cardboard parameters to external storage."
            r8 = 7
            android.util.Log.i(r0, r1)
        L9d:
            return
        L9e:
            r0 = move-exception
            r1 = r2
        La0:
            if (r1 == 0) goto La7
            r7 = 7
            r7 = 4
            r1.close()     // Catch: java.io.IOException -> La7
        La7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.vrtoolkit.cardboard.HeadMountedDisplayManager.writeCardboardParamsToExternalStorage():void");
    }

    public HeadMountedDisplay getHeadMountedDisplay() {
        return this.hmd;
    }

    public void onPause() {
    }

    public void onResume() {
        CardboardDeviceParams createCardboardDeviceParamsFromExternalStorage = createCardboardDeviceParamsFromExternalStorage();
        if (createCardboardDeviceParamsFromExternalStorage != null && !createCardboardDeviceParamsFromExternalStorage.equals(this.hmd.getCardboardDeviceParams())) {
            this.hmd.setCardboardDeviceParams(createCardboardDeviceParamsFromExternalStorage);
            Log.i(TAG, "Successfully read updated device params from external storage");
        }
        ScreenParams createScreenParamsFromExternalStorage = createScreenParamsFromExternalStorage(getDisplay());
        if (createScreenParamsFromExternalStorage != null && !createScreenParamsFromExternalStorage.equals(this.hmd.getScreenParams())) {
            this.hmd.setScreenParams(createScreenParamsFromExternalStorage);
            Log.i(TAG, "Successfully read updated screen params from external storage");
        }
    }

    public boolean updateCardboardDeviceParams(CardboardDeviceParams cardboardDeviceParams) {
        if (cardboardDeviceParams == null || cardboardDeviceParams.equals(this.hmd.getCardboardDeviceParams())) {
            return false;
        }
        this.hmd.setCardboardDeviceParams(cardboardDeviceParams);
        writeCardboardParamsToExternalStorage();
        return true;
    }

    public boolean updateScreenParams(ScreenParams screenParams) {
        if (screenParams == null || screenParams.equals(this.hmd.getScreenParams())) {
            return false;
        }
        this.hmd.setScreenParams(screenParams);
        return true;
    }
}
