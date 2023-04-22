package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.mixpanel.android.mpmetrics.InAppNotification;
import com.mixpanel.android.util.ImageStore;
import com.mixpanel.android.util.RemoteService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class DecideChecker {

    /* renamed from: f  reason: collision with root package name */
    public static final JSONArray f8157f = new JSONArray();

    /* renamed from: a  reason: collision with root package name */
    public final cd.c f8158a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f8159b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, c> f8160c = new HashMap();
    public final ImageStore d;

    /* renamed from: e  reason: collision with root package name */
    public final cd.j f8161e;

    /* loaded from: classes.dex */
    public static class UnintelligibleMessageException extends Exception {
        private static final long serialVersionUID = -6501269367559104957L;

        public UnintelligibleMessageException(String str, JSONException jSONException) {
            super(str, jSONException);
        }
    }

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<InAppNotification> f8162a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final List<InAppNotification> f8163b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public JSONArray f8164c;
        public JSONArray d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f8165e;

        /* renamed from: f  reason: collision with root package name */
        public JSONArray f8166f;

        public a() {
            JSONArray jSONArray = DecideChecker.f8157f;
            this.f8164c = jSONArray;
            this.d = jSONArray;
            this.f8165e = false;
        }
    }

    public DecideChecker(Context context, cd.c cVar) {
        this.f8159b = context;
        this.f8158a = cVar;
        this.d = new ImageStore(context, "DecideChecker");
        this.f8161e = cd.j.a(context);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final com.mixpanel.android.mpmetrics.DecideChecker.a a(java.lang.String r13, java.lang.String r14, com.mixpanel.android.util.RemoteService r15) {
        /*
            Method dump skipped, instructions count: 897
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.DecideChecker.a(java.lang.String, java.lang.String, com.mixpanel.android.util.RemoteService):com.mixpanel.android.mpmetrics.DecideChecker$a");
    }

    public void b(String str, RemoteService remoteService) {
        String str2;
        c cVar = this.f8160c.get(str);
        if (cVar != null) {
            synchronized (cVar) {
                str2 = cVar.f8231a;
            }
            try {
                a a10 = a(cVar.f8232b, str2, remoteService);
                if (a10 != null) {
                    cVar.b(a10.f8162a, a10.f8163b, a10.f8164c, a10.d, a10.f8165e, a10.f8166f);
                }
            } catch (UnintelligibleMessageException e10) {
                cb.e.D("MixpanelAPI.DChecker", e10.getMessage(), e10);
            }
        }
    }

    public final void c(Iterator<InAppNotification> it) {
        Bitmap bitmap;
        while (it.hasNext()) {
            InAppNotification next = it.next();
            Context context = this.f8159b;
            int i10 = 0;
            String[] strArr = {InAppNotification.e(next.f8173w, "@2x"), next.f8173w};
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            int i11 = point.x;
            if (next.b() == InAppNotification.Type.TAKEOVER && i11 >= 720) {
                strArr = new String[]{InAppNotification.e(next.f8173w, "@4x"), InAppNotification.e(next.f8173w, "@2x"), next.f8173w};
            }
            int length = strArr.length;
            while (true) {
                if (i10 >= length) {
                    bitmap = null;
                    break;
                }
                String str = strArr[i10];
                try {
                    bitmap = this.d.b(str);
                    break;
                } catch (ImageStore.CantGetImageException e10) {
                    cb.e.i0("MixpanelAPI.DChecker", "Can't load image " + str + " for a notification", e10);
                    i10++;
                }
            }
            if (bitmap == null) {
                StringBuilder m10 = a1.a.m("Could not retrieve image for notification ");
                m10.append(next.f8169j);
                m10.append(", will not show the notification.");
                cb.e.O("MixpanelAPI.DChecker", m10.toString());
                it.remove();
            } else {
                next.f8174z = bitmap;
            }
        }
    }
}
