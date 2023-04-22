package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.annotation.Keep;
import java.util.Objects;
import v8.b;
import v8.d;
import v8.f;
import w8.g;

@Keep
/* loaded from: classes.dex */
public class MediaIntentReceiver extends BroadcastReceiver {
    public static final String ACTION_DISCONNECT = "com.google.android.gms.cast.framework.action.DISCONNECT";
    public static final String ACTION_FORWARD = "com.google.android.gms.cast.framework.action.FORWARD";
    public static final String ACTION_REWIND = "com.google.android.gms.cast.framework.action.REWIND";
    public static final String ACTION_SKIP_NEXT = "com.google.android.gms.cast.framework.action.SKIP_NEXT";
    public static final String ACTION_SKIP_PREV = "com.google.android.gms.cast.framework.action.SKIP_PREV";
    public static final String ACTION_STOP_CASTING = "com.google.android.gms.cast.framework.action.STOP_CASTING";
    public static final String ACTION_TOGGLE_PLAYBACK = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";
    public static final String EXTRA_SKIP_STEP_MS = "googlecast-extra_skip_step_ms";

    private static g getRemoteMediaClient(d dVar) {
        if (dVar == null || !dVar.c()) {
            return null;
        }
        return dVar.l();
    }

    private void seek(d dVar, long j10) {
        g remoteMediaClient;
        if (j10 == 0 || (remoteMediaClient = getRemoteMediaClient(dVar)) == null || remoteMediaClient.l() || remoteMediaClient.p()) {
            return;
        }
        remoteMediaClient.t(remoteMediaClient.c() + j10);
    }

    private void togglePlayback(d dVar) {
        g remoteMediaClient = getRemoteMediaClient(dVar);
        if (remoteMediaClient == null) {
            return;
        }
        remoteMediaClient.v();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        v8.g b10;
        f d;
        char c10;
        String action = intent.getAction();
        if (action != null && (d = (b10 = b.c(context).b()).d()) != null) {
            switch (action.hashCode()) {
                case -1699820260:
                    if (action.equals(ACTION_REWIND)) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -945151566:
                    if (action.equals(ACTION_SKIP_NEXT)) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -945080078:
                    if (action.equals(ACTION_SKIP_PREV)) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -668151673:
                    if (action.equals(ACTION_STOP_CASTING)) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -124479363:
                    if (action.equals(ACTION_DISCONNECT)) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 235550565:
                    if (action.equals(ACTION_TOGGLE_PLAYBACK)) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1362116196:
                    if (action.equals(ACTION_FORWARD)) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1997055314:
                    if (action.equals("android.intent.action.MEDIA_BUTTON")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    onReceiveActionTogglePlayback(d);
                    return;
                case 1:
                    onReceiveActionSkipNext(d);
                    return;
                case 2:
                    onReceiveActionSkipPrev(d);
                    return;
                case 3:
                    onReceiveActionForward(d, intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                    return;
                case 4:
                    onReceiveActionRewind(d, intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                    return;
                case 5:
                    b10.b(true);
                    return;
                case 6:
                    b10.b(false);
                    return;
                case 7:
                    onReceiveActionMediaButton(d, intent);
                    return;
                default:
                    onReceiveOtherAction(context, action, intent);
                    return;
            }
        }
    }

    public void onReceiveActionForward(f fVar, long j10) {
        if (fVar instanceof d) {
            seek((d) fVar, j10);
        }
    }

    public void onReceiveActionMediaButton(f fVar, Intent intent) {
        if ((fVar instanceof d) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Bundle extras = intent.getExtras();
            Objects.requireNonNull(extras, "null reference");
            KeyEvent keyEvent = (KeyEvent) extras.get("android.intent.extra.KEY_EVENT");
            if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
                togglePlayback((d) fVar);
            }
        }
    }

    public void onReceiveActionRewind(f fVar, long j10) {
        if (fVar instanceof d) {
            seek((d) fVar, -j10);
        }
    }

    public void onReceiveActionSkipNext(f fVar) {
        g remoteMediaClient;
        if ((fVar instanceof d) && (remoteMediaClient = getRemoteMediaClient((d) fVar)) != null) {
            if (remoteMediaClient.p()) {
                return;
            }
            remoteMediaClient.q(null);
        }
    }

    public void onReceiveActionSkipPrev(f fVar) {
        g remoteMediaClient;
        if (!(fVar instanceof d) || (remoteMediaClient = getRemoteMediaClient((d) fVar)) == null || remoteMediaClient.p()) {
            return;
        }
        remoteMediaClient.r(null);
    }

    public void onReceiveActionTogglePlayback(f fVar) {
        if (fVar instanceof d) {
            togglePlayback((d) fVar);
        }
    }

    public void onReceiveOtherAction(Context context, String str, Intent intent) {
    }

    @Deprecated
    public void onReceiveOtherAction(String str, Intent intent) {
        onReceiveOtherAction(null, str, intent);
    }
}
