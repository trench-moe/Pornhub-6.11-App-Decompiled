package io.realm.internal;

import io.realm.internal.i;
import io.realm.r;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public abstract class RealmNotifier implements Closeable {
    private OsSharedRealm sharedRealm;
    private i<b> realmObserverPairs = new i<>();
    private final i.a<b> onChangeCallBack = new a();
    private List<Runnable> transactionCallbacks = new ArrayList();
    private List<Runnable> startSendingNotificationsCallbacks = new ArrayList();
    private List<Runnable> finishedSendingNotificationsCallbacks = new ArrayList();

    /* loaded from: classes2.dex */
    public class a implements i.a<b> {
        public a() {
        }

        @Override // io.realm.internal.i.a
        public void a(b bVar, Object obj) {
            b bVar2 = bVar;
            if (RealmNotifier.this.sharedRealm == null || RealmNotifier.this.sharedRealm.isClosed()) {
                return;
            }
            ((r) bVar2.f10961b).a(obj);
        }
    }

    /* loaded from: classes2.dex */
    public static class b<T> extends i.b<T, r<T>> {
        public b(T t2, r<T> rVar) {
            super(t2, rVar);
        }
    }

    public RealmNotifier(OsSharedRealm osSharedRealm) {
        this.sharedRealm = osSharedRealm;
    }

    private void removeAllChangeListeners() {
        i<b> iVar = this.realmObserverPairs;
        iVar.f10959b = true;
        iVar.f10958a.clear();
    }

    public void addBeginSendingNotificationsCallback(Runnable runnable) {
        this.startSendingNotificationsCallbacks.add(runnable);
    }

    public <T> void addChangeListener(T t2, r<T> rVar) {
        this.realmObserverPairs.a(new b(t2, rVar));
    }

    public void addFinishedSendingNotificationsCallback(Runnable runnable) {
        this.finishedSendingNotificationsCallbacks.add(runnable);
    }

    public void addTransactionCallback(Runnable runnable) {
        this.transactionCallbacks.add(runnable);
    }

    public void beforeNotify() {
        this.sharedRealm.invalidateIterators();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        removeAllChangeListeners();
        this.startSendingNotificationsCallbacks.clear();
        this.finishedSendingNotificationsCallbacks.clear();
    }

    public void didChange() {
        this.realmObserverPairs.b(this.onChangeCallBack);
        if (this.transactionCallbacks.isEmpty()) {
            return;
        }
        List<Runnable> list = this.transactionCallbacks;
        this.transactionCallbacks = new ArrayList();
        for (Runnable runnable : list) {
            runnable.run();
        }
    }

    public void didSendNotifications() {
        for (int i10 = 0; i10 < this.startSendingNotificationsCallbacks.size(); i10++) {
            this.finishedSendingNotificationsCallbacks.get(i10).run();
        }
    }

    public int getListenersListSize() {
        return this.realmObserverPairs.f10958a.size();
    }

    public abstract boolean post(Runnable runnable);

    public <E> void removeChangeListener(E e10, r<E> rVar) {
        this.realmObserverPairs.d(e10, rVar);
    }

    public <E> void removeChangeListeners(E e10) {
        this.realmObserverPairs.e(e10);
    }

    public void willSendNotifications() {
        for (int i10 = 0; i10 < this.startSendingNotificationsCallbacks.size(); i10++) {
            this.startSendingNotificationsCallbacks.get(i10).run();
        }
    }
}
