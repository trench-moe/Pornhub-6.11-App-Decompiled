package com.mixpanel.android.mpmetrics;

import android.content.Context;
import com.mixpanel.android.mpmetrics.a;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class c {

    /* renamed from: l  reason: collision with root package name */
    public static final Set<Integer> f8230l = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final String f8232b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<Integer> f8233c;

    /* renamed from: f  reason: collision with root package name */
    public final a f8235f;

    /* renamed from: g  reason: collision with root package name */
    public final fd.e f8236g;

    /* renamed from: i  reason: collision with root package name */
    public Boolean f8238i;

    /* renamed from: j  reason: collision with root package name */
    public Context f8239j;

    /* renamed from: a  reason: collision with root package name */
    public String f8231a = null;
    public final List<InAppNotification> d = new LinkedList();

    /* renamed from: e  reason: collision with root package name */
    public final List<InAppNotification> f8234e = new LinkedList();

    /* renamed from: h  reason: collision with root package name */
    public JSONArray f8237h = null;

    /* renamed from: k  reason: collision with root package name */
    public Set<String> f8240k = new HashSet();

    /* loaded from: classes.dex */
    public interface a {
    }

    public c(Context context, String str, a aVar, fd.e eVar, HashSet<Integer> hashSet) {
        this.f8239j = context;
        this.f8232b = str;
        this.f8235f = aVar;
        this.f8236g = eVar;
        this.f8233c = new HashSet(hashSet);
    }

    public synchronized InAppNotification a(a.C0108a c0108a, boolean z10) {
        if (this.f8234e.isEmpty()) {
            cb.e.h0("MixpanelAPI.DecideUpdts", "No unseen triggered notifications exist, none will be returned.");
            return null;
        }
        for (int i10 = 0; i10 < this.f8234e.size(); i10++) {
            InAppNotification inAppNotification = this.f8234e.get(i10);
            if (inAppNotification.d(c0108a)) {
                if (!z10) {
                    this.f8234e.remove(i10);
                    cb.e.h0("MixpanelAPI.DecideUpdts", "recording triggered notification " + inAppNotification.f8169j + " as seen " + c0108a.f8208c);
                }
                return inAppNotification;
            }
            cb.e.h0("MixpanelAPI.DecideUpdts", "triggered notification " + inAppNotification.f8169j + " does not match event " + c0108a.f8208c);
        }
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public synchronized void b(java.util.List<com.mixpanel.android.mpmetrics.InAppNotification> r10, java.util.List<com.mixpanel.android.mpmetrics.InAppNotification> r11, org.json.JSONArray r12, org.json.JSONArray r13, boolean r14, org.json.JSONArray r15) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.c.b(java.util.List, java.util.List, org.json.JSONArray, org.json.JSONArray, boolean, org.json.JSONArray):void");
    }

    public synchronized void c(String str) {
        try {
            String str2 = this.f8231a;
            if (str2 == null || !str2.equals(str)) {
                this.d.clear();
            }
            this.f8231a = str;
        } catch (Throwable th) {
            throw th;
        }
    }
}
