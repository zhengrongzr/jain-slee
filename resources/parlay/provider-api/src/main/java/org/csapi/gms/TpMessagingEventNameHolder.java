package org.csapi.gms;
/**
 *	Generated from IDL definition of enum "TpMessagingEventName"
 *	@author JacORB IDL compiler 
 */

public final class TpMessagingEventNameHolder
	implements org.omg.CORBA.portable.Streamable
{
	public TpMessagingEventName value;

	public TpMessagingEventNameHolder ()
	{
	}
	public TpMessagingEventNameHolder (final TpMessagingEventName initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TpMessagingEventNameHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TpMessagingEventNameHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TpMessagingEventNameHelper.write (out,value);
	}
}
