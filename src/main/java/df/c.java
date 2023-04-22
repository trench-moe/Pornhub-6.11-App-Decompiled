package df;

/* loaded from: classes2.dex */
public interface c<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t2);

    void onSubscribe(d dVar);
}
