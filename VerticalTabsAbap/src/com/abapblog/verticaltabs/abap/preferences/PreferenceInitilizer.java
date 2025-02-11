package com.abapblog.verticaltabs.abap.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import com.abapblog.verticaltabs.Activator;

public class PreferenceInitilizer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		final IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(PreferenceConstants.SHOW_ONLY_INACTIVE_EDITORS, false);
		store.setDefault(PreferenceConstants.SHOW_ONLY_LOCKED_EDITORS, false);
	}

}
