
/* Class318_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

public class Class318_Sub1 extends Class318 {
    Socket aSocket7688;
    Class316 aClass316_7689;
    Class330 aClass330_7690;

    @Override
    public void method3866(byte[] is, int i, int i_0_) throws IOException {
	this.aClass330_7690.method3998(is, i, i_0_, -1957971249);
    }

    @Override
    public boolean isAvailable(int i, byte i_1_) throws IOException {
	try {
	    return this.aClass316_7689.method3840(i, 1797469509);
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("acl.f(").append(')').toString());
	}
    }

    @Override
    public int method3857(int i) throws IOException {
	try {
	    return this.aClass316_7689.method3841((byte) 19);
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("acl.b(").append(')').toString());
	}
    }

    @Override
    public int readBytes(byte[] is, int i, int i_2_, byte i_3_) throws IOException {
	try {
	    return this.aClass316_7689.method3843(is, i, i_2_, (byte) 54);
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("acl.p(").append(')').toString());
	}
    }

    @Override
    public void method3868(byte[] is, int i, int i_4_, int i_5_) throws IOException {
	try {
	    this.aClass330_7690.method3998(is, i, i_4_, -2010830691);
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("acl.i(").append(')').toString());
	}
    }

    @Override
    public void method3860(int i) {
	try {
	    this.aClass330_7690.method4001(678482839);
	    try {
		this.aSocket7688.close();
	    }
	    catch (IOException ioexception) {
		/* empty */
	    }
	    this.aClass316_7689.method3842(2033353307);
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("acl.k(").append(')').toString());
	}
    }

    @Override
    public void method3867(byte i) {
	try {
	    this.aClass316_7689.method3839(-867525250);
	    this.aClass330_7690.method4000((byte) 103);
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("acl.d(").append(')').toString());
	}
    }

    @Override
    protected void finalize() {
	try {
	    method3860(-2126133391);
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("acl.finalize(").append(')').toString());
	}
    }

    Class318_Sub1(Socket socket, int i) throws IOException {
	this.aSocket7688 = socket;
	this.aSocket7688.setSoTimeout(30000); // 30000
	this.aSocket7688.setTcpNoDelay(true);
	this.aClass316_7689 = new Class316(this.aSocket7688.getInputStream(), i);
	this.aClass330_7690 = new Class330(this.aSocket7688.getOutputStream(), i);
    }

    @Override
    public void method3863() {
	this.aClass330_7690.method4001(1904718634);
	try {
	    this.aSocket7688.close();
	}
	catch (IOException ioexception) {
	    /* empty */
	}
	this.aClass316_7689.method3842(2078389342);
    }

    @Override
    public boolean method3861(int i) throws IOException {
	return this.aClass316_7689.method3840(i, 901344391);
    }

    @Override
    public int method3864(byte[] is, int i, int i_6_) throws IOException {
	return this.aClass316_7689.method3843(is, i, i_6_, (byte) 88);
    }

    @Override
    public void method3865(byte[] is, int i, int i_7_) throws IOException {
	this.aClass330_7690.method3998(is, i, i_7_, -1140067311);
    }

    @Override
    public int method3869(byte[] is, int i, int i_8_) throws IOException {
	return this.aClass316_7689.method3843(is, i, i_8_, (byte) 44);
    }

    @Override
    public void method3862(byte[] is, int i, int i_9_) throws IOException {
	this.aClass330_7690.method3998(is, i, i_9_, -629136417);
    }

    @Override
    public int method3855() throws IOException {
	return this.aClass316_7689.method3841((byte) -61);
    }

    @Override
    public void method3859() {
	this.aClass316_7689.method3839(124317487);
	this.aClass330_7690.method4000((byte) 25);
    }

    static final void method3876(Class403 class403, int i) {
	try {
	    class403.anIntArray5244[((class403.anInt5239 += -391880689) * 681479919 - 1)] = 0;
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("acl.uv(").append(')').toString());
	}
    }
}
