package com.google.vrtoolkit.cardboard.sensors;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.Ndef;
import android.os.Handler;
import android.util.Log;
import com.google.vrtoolkit.cardboard.CardboardDeviceParams;
import com.google.vrtoolkit.cardboard.PermissionUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;

/* loaded from: classes.dex */
public class NfcSensor {
    private static final int MAX_CONNECTION_FAILURES = 1;
    private static final long NFC_POLLING_INTERVAL_MS = 250;
    private static final String TAG = "NfcSensor";
    private static NfcSensor sInstance;
    private final Context context;
    private Ndef currentNdef;
    private Tag currentTag;
    private boolean currentTagIsCardboard;
    private final NfcAdapter nfcAdapter;
    private BroadcastReceiver nfcBroadcastReceiver;
    private Timer nfcDisconnectTimer;
    private IntentFilter[] nfcIntentFilters;
    private int tagConnectionFailures;
    private final List<ListenerHelper> listeners = new ArrayList();
    private final Object tagLock = new Object();

    /* loaded from: classes.dex */
    public static class ListenerHelper implements OnCardboardNfcListener {
        private Handler handler;
        private OnCardboardNfcListener listener;

        public ListenerHelper(OnCardboardNfcListener onCardboardNfcListener, Handler handler) {
            this.listener = onCardboardNfcListener;
            this.handler = handler;
        }

        public OnCardboardNfcListener getListener() {
            return this.listener;
        }

        @Override // com.google.vrtoolkit.cardboard.sensors.NfcSensor.OnCardboardNfcListener
        public void onInsertedIntoCardboard(final CardboardDeviceParams cardboardDeviceParams) {
            this.handler.post(new Runnable() { // from class: com.google.vrtoolkit.cardboard.sensors.NfcSensor.ListenerHelper.1
                @Override // java.lang.Runnable
                public void run() {
                    ListenerHelper.this.listener.onInsertedIntoCardboard(cardboardDeviceParams);
                }
            });
        }

        @Override // com.google.vrtoolkit.cardboard.sensors.NfcSensor.OnCardboardNfcListener
        public void onRemovedFromCardboard() {
            this.handler.post(new Runnable() { // from class: com.google.vrtoolkit.cardboard.sensors.NfcSensor.ListenerHelper.2
                @Override // java.lang.Runnable
                public void run() {
                    ListenerHelper.this.listener.onRemovedFromCardboard();
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public interface OnCardboardNfcListener {
        void onInsertedIntoCardboard(CardboardDeviceParams cardboardDeviceParams);

        void onRemovedFromCardboard();
    }

    private NfcSensor(Context context) {
        this.context = context.getApplicationContext();
        if (PermissionUtils.hasPermission(context, "android.permission.NFC")) {
            this.nfcAdapter = NfcAdapter.getDefaultAdapter(context);
        } else {
            this.nfcAdapter = null;
        }
        if (this.nfcAdapter == null) {
            return;
        }
        this.nfcBroadcastReceiver = new BroadcastReceiver() { // from class: com.google.vrtoolkit.cardboard.sensors.NfcSensor.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                NfcSensor.this.onNfcIntent(intent);
            }
        };
    }

    public static /* synthetic */ int access$204(NfcSensor nfcSensor) {
        int i10 = nfcSensor.tagConnectionFailures + 1;
        nfcSensor.tagConnectionFailures = i10;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeCurrentNfcTag() {
        Timer timer = this.nfcDisconnectTimer;
        if (timer != null) {
            timer.cancel();
        }
        Ndef ndef = this.currentNdef;
        if (ndef == null) {
            return;
        }
        try {
            ndef.close();
        } catch (IOException e10) {
            Log.w(TAG, e10.toString());
        }
        this.currentTag = null;
        this.currentNdef = null;
        this.currentTagIsCardboard = false;
    }

    public static NfcSensor getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new NfcSensor(context);
        }
        return sInstance;
    }

    private boolean isCardboardNdefMessage(NdefMessage ndefMessage) {
        if (ndefMessage == null) {
            return false;
        }
        for (NdefRecord ndefRecord : ndefMessage.getRecords()) {
            if (isCardboardNdefRecord(ndefRecord)) {
                return true;
            }
        }
        return false;
    }

    private boolean isCardboardNdefRecord(NdefRecord ndefRecord) {
        Uri uri;
        return (ndefRecord == null || (uri = ndefRecord.toUri()) == null || !CardboardDeviceParams.isCardboardUri(uri)) ? false : true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private void onNewNfcTag(android.nfc.Tag r13) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.vrtoolkit.cardboard.sensors.NfcSensor.onNewNfcTag(android.nfc.Tag):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendDisconnectionEvent() {
        synchronized (this.listeners) {
            for (ListenerHelper listenerHelper : this.listeners) {
                listenerHelper.onRemovedFromCardboard();
            }
        }
    }

    public void addOnCardboardNfcListener(OnCardboardNfcListener onCardboardNfcListener) {
        if (onCardboardNfcListener == null) {
            return;
        }
        synchronized (this.listeners) {
            if (this.listeners.isEmpty()) {
                IntentFilter intentFilter = new IntentFilter("android.nfc.action.NDEF_DISCOVERED");
                intentFilter.addAction("android.nfc.action.TECH_DISCOVERED");
                intentFilter.addAction("android.nfc.action.TAG_DISCOVERED");
                this.nfcIntentFilters = new IntentFilter[]{intentFilter};
                this.context.registerReceiver(this.nfcBroadcastReceiver, intentFilter);
            }
            for (ListenerHelper listenerHelper : this.listeners) {
                if (listenerHelper.getListener() == onCardboardNfcListener) {
                    return;
                }
            }
            this.listeners.add(new ListenerHelper(onCardboardNfcListener, new Handler()));
        }
    }

    public NdefMessage getCurrentTagContents() {
        NdefMessage ndefMessage;
        synchronized (this.tagLock) {
            Ndef ndef = this.currentNdef;
            ndefMessage = ndef != null ? ndef.getNdefMessage() : null;
        }
        return ndefMessage;
    }

    public int getTagCapacity() {
        int maxSize;
        synchronized (this.tagLock) {
            Ndef ndef = this.currentNdef;
            if (ndef == null) {
                throw new IllegalStateException("No NFC tag");
            }
            maxSize = ndef.getMaxSize();
        }
        return maxSize;
    }

    public NdefMessage getTagContents() {
        NdefMessage cachedNdefMessage;
        synchronized (this.tagLock) {
            Ndef ndef = this.currentNdef;
            cachedNdefMessage = ndef != null ? ndef.getCachedNdefMessage() : null;
        }
        return cachedNdefMessage;
    }

    public boolean isDeviceInCardboard() {
        boolean z10;
        synchronized (this.tagLock) {
            z10 = this.currentTagIsCardboard;
        }
        return z10;
    }

    public boolean isNfcEnabled() {
        return isNfcSupported() && this.nfcAdapter.isEnabled();
    }

    public boolean isNfcSupported() {
        return this.nfcAdapter != null;
    }

    public void onNfcIntent(Intent intent) {
        if (isNfcEnabled() && intent != null && this.nfcIntentFilters[0].matchAction(intent.getAction())) {
            onNewNfcTag((Tag) intent.getParcelableExtra("android.nfc.extra.TAG"));
        }
    }

    public void onPause(Activity activity) {
        if (isNfcEnabled()) {
            this.nfcAdapter.disableForegroundDispatch(activity);
        }
    }

    public void onResume(Activity activity) {
        if (isNfcEnabled()) {
            Intent intent = new Intent("android.nfc.action.NDEF_DISCOVERED");
            intent.setPackage(activity.getPackageName());
            this.nfcAdapter.enableForegroundDispatch(activity, PendingIntent.getBroadcast(this.context, 0, intent, 0), this.nfcIntentFilters, null);
        }
    }

    public void removeOnCardboardNfcListener(OnCardboardNfcListener onCardboardNfcListener) {
        if (onCardboardNfcListener == null) {
            return;
        }
        synchronized (this.listeners) {
            Iterator<ListenerHelper> it = this.listeners.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ListenerHelper next = it.next();
                if (next.getListener() == onCardboardNfcListener) {
                    this.listeners.remove(next);
                    break;
                }
            }
            if (this.nfcBroadcastReceiver != null && this.listeners.isEmpty()) {
                this.context.unregisterReceiver(this.nfcBroadcastReceiver);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public void writeUri(android.net.Uri r13) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.vrtoolkit.cardboard.sensors.NfcSensor.writeUri(android.net.Uri):void");
    }
}
