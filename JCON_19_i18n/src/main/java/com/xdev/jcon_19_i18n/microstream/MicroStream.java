
package com.xdev.jcon_19_i18n.microstream;

import java.nio.file.Path;
import java.nio.file.Paths;

import one.microstream.storage.types.EmbeddedStorage;
import one.microstream.storage.types.EmbeddedStorageManager;


public final class MicroStream
{
	private final static DataRoot               root = new DataRoot();
	private final static EmbeddedStorageManager storageManager;
	static
	{
		final Path path = Paths.get(System.getProperty("user.home"), "JCON19_i18n");
		storageManager = EmbeddedStorage.start(MicroStream.root, path.toFile());
	}

	public static DataRoot root()
	{
		return MicroStream.root;
	}

	public static EmbeddedStorageManager storageManager()
	{
		return MicroStream.storageManager;
	}

	private MicroStream()
	{
	}
}
