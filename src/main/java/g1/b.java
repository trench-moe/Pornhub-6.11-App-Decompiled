package g1;

import android.media.session.MediaSessionManager;

/* loaded from: classes.dex */
public final class b extends c {
    public b(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
    }

    public b(String str, int i10, int i11) {
        super(str, i10, i11);
        new MediaSessionManager.RemoteUserInfo(str, i10, i11);
    }
}
