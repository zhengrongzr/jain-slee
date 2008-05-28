package org.csapi.fw;


/**
 *	Generated from IDL definition of struct "TpAddSagMembersConflict"
 *	@author JacORB IDL compiler 
 */

public final class TpAddSagMembersConflictHelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.csapi.fw.TpAddSagMembersConflictHelper.id(),"TpAddSagMembersConflict",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("ClientApplication", org.csapi.fw.TpClientAppIDHelper.type(), null),new org.omg.CORBA.StructMember("ConflictGeneratingSagProfilePair", org.csapi.fw.TpSagProfilePairHelper.type(), null),new org.omg.CORBA.StructMember("AlreadyAssignedSagProfilePair", org.csapi.fw.TpSagProfilePairHelper.type(), null),new org.omg.CORBA.StructMember("Service", org.csapi.fw.TpServiceIDHelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.csapi.fw.TpAddSagMembersConflict s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.csapi.fw.TpAddSagMembersConflict extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:org/csapi/fw/TpAddSagMembersConflict:1.0";
	}
	public static org.csapi.fw.TpAddSagMembersConflict read (final org.omg.CORBA.portable.InputStream in)
	{
		org.csapi.fw.TpAddSagMembersConflict result = new org.csapi.fw.TpAddSagMembersConflict();
		result.ClientApplication=in.read_string();
		result.ConflictGeneratingSagProfilePair=org.csapi.fw.TpSagProfilePairHelper.read(in);
		result.AlreadyAssignedSagProfilePair=org.csapi.fw.TpSagProfilePairHelper.read(in);
		result.Service=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.csapi.fw.TpAddSagMembersConflict s)
	{
		out.write_string(s.ClientApplication);
		org.csapi.fw.TpSagProfilePairHelper.write(out,s.ConflictGeneratingSagProfilePair);
		org.csapi.fw.TpSagProfilePairHelper.write(out,s.AlreadyAssignedSagProfilePair);
		out.write_string(s.Service);
	}
}
