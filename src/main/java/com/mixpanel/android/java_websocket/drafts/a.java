package com.mixpanel.android.java_websocket.drafts;

import com.mixpanel.android.java_websocket.drafts.Draft;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class a extends Draft_10 {
    @Override // com.mixpanel.android.java_websocket.drafts.Draft_10, com.mixpanel.android.java_websocket.drafts.Draft
    public Draft.HandshakeState b(ad.a aVar) {
        return Draft_10.p(aVar) == 13 ? Draft.HandshakeState.MATCHED : Draft.HandshakeState.NOT_MATCHED;
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft_10, com.mixpanel.android.java_websocket.drafts.Draft
    public Draft e() {
        return new a();
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft_10, com.mixpanel.android.java_websocket.drafts.Draft
    public ad.c i(ad.c cVar) {
        super.i(cVar);
        ((TreeMap) cVar.f1018f).put("Sec-WebSocket-Version", "13");
        return cVar;
    }
}
