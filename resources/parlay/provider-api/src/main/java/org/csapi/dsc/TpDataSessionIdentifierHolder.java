package org.csapi.dsc;

/**
 *	Generated from IDL definition of struct "TpDataSessionIdentifier"
 *	@author JacORB IDL compiler 
 */

public final class TpDataSessionIdentifierHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.csapi.dsc.TpDataSessionIdentifier value;

	public TpDataSessionIdentifierHolder ()
	{
	}
	public TpDataSessionIdentifierHolder(final org.csapi.dsc.TpDataSessionIdentifier initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.csapi.dsc.TpDataSessionIdentifierHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.csapi.dsc.TpDataSessionIdentifierHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.csapi.dsc.TpDataSessionIdentifierHelper.write(_out, value);
	}
}
