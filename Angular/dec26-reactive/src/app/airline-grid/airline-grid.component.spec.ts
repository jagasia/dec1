import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AirlineGridComponent } from './airline-grid.component';

describe('AirlineGridComponent', () => {
  let component: AirlineGridComponent;
  let fixture: ComponentFixture<AirlineGridComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AirlineGridComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AirlineGridComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
